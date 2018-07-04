package javamultiplelinearregression.src;

public class MultipleLinearRegression {
    public static void main(String[] args){
        Observation[] inputVectors = FileHandler.read("src/javamultiplelinearregression/src/student_mat_dataset.csv");
        
      //   Observation[] calculateOutput = {1,0,4,4,2,2,0,1,0,0,0,0,4,3,4,3,6,5,6};
        
        // Fits the model predicting the feature compressivestrength using gradient descent. 
        double alpha = 0.0001;
        System.out.println("\n\nFitting model using gradient descent, alpha = " + alpha + " ...");
        System.out.println("*************************************************************************\n");
        Model gradientFit = Fit.gradientDescent(inputVectors, "g3", 0.0001);
        System.out.println("gradient fit"+gradientFit.toString());
        
        // Fits the model predicting the feature compressivestrength using the normal equation method. 
        System.out.println("\n\nFitting model in using the normal equation method ...");
        System.out.println("*************************************************************************\n");
        Model normalFit = Fit.normalEquation(inputVectors, "g3");
        System.out.println(normalFit.toString());
        
        // Demonstrates the Model.predict() method, as well as the model fits, by predicting some arbitrary rows of the dataset. 
        System.out.println("\n\nPredicting some arbitrary rows using both models ...\n");
        double testValue = inputVectors[1].getFeature("g3");
        double predictionA = gradientFit.predict(inputVectors[1]);
        double predictionB = normalFit.predict(inputVectors[1]);
        System.out.println("Actual value: " + testValue + "\nPrediction using gradient descent: " + predictionA);
        System.out.println("Prediction using normal equation method: " + predictionB);
        testValue = inputVectors[40].getFeature("g3");
        predictionA = gradientFit.predict(inputVectors[40]);
        predictionB = normalFit.predict(inputVectors[40]);
        System.out.println("Actual value: " + testValue + "\nPrediction using gradient descent: " + predictionA);
        System.out.println("Prediction using normal equation method: " + predictionB);
        testValue = inputVectors[50].getFeature("g3");
        predictionA = gradientFit.predict(inputVectors[50]);
        predictionB = normalFit.predict(inputVectors[50]);
        System.out.println("Actual value: " + testValue + "\nPrediction using gradient descent: " + predictionA);
        System.out.println("Prediction using normal equation method: " + predictionB);
    }
}
