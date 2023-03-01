# KNN_MAP
The aim of this project is to develop a Java-based client-server application that implements a KNN Regressor. Two clients have been developed, one based on a prompt and the other using GluonFX.

The project's package structure is organized into folders to facilitate understanding of how it works.

For any questions, please contact me at work@daddarioluigi.com.

# How it works:

While the server is waiting for requests, the launched client can send messages to initiate a KNN prediction. The client requests a new KNN instance, and the prediction dataset can be loaded from a .txt file, serialized file, or database. Once KNN is started, the dataset is read and a message exchange is initiated, in which the server requests features and the client provides them. Finally, the server returns the prediction.
