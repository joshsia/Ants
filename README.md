# Ants

Authors: Joshua Sia, Yi Teng Voon, Chanasak Mahankarat, Cal-Vin Ng, Xian Zhang

Date: 2020-01-13

This repository works together with the repository AntsServlet.

Note: This project is no longer being maintained.

## About

Citizen Science - Machine learning to understand ant behaviour in the zoo

The Evolutionary Biomechanics Group at Imperial College London led by Dr David Labonte is currently working to automate behavioural analyses on ants, specifically leaf cutter ants (genus Atta), to study emergence and swarm intelligence in eusocial insects. Individually, ants are unable to perform complex tasks and are likely to die. However, in a colony, ants are able to delegate tasks, communicate with each other, and forage for food. The research aims to answer the question of how ants are able to display such behaviours in a colony, and to use the results to build a model which can be studied and then applied to systems such as traffic handling and route planning. In order to achieve this, the research is broken down into two main parts. The first part involves tracking the position of individual ants, and the second part involves task recognition. This project focuses on the first part of the research - tracking individual ants’ positions.

Machine learning and computer vision tools play a huge role in ant behaviour research, however, large training datasets are required. Collection of labelled data can be difficult because of the sheer number of ants, and the complexity of behaviours displayed. Thus, there is a need to develop an application that will be used for labelled data collection, which should be easily used and understood by the general public. The UI will be used in a zoo in Zurich as part of a Citizen Science project, in order to collect more data efficiently and quickly to train the machine learning algorithms.

The landing page the user first sees shows the videos that have not been fully labelled yet, and a progress bar indicating how many frames have been labelled.

![landing-page](https://github.com/joshsia/Ants/blob/main/ui_images/landing-page.png)

Clicking on the "Start Tracking! button takes users to the tracking page. On this page, one frame of the video is shown with the previous frame translucently overlayed on top of the current frame. This is done so that users can more accurately gauge the trajectory of the ants, and provide higher quality labels. The left panel of numbers shows the current ID of the ants being labelled. Users can add or remove ants if they come into or out of the frame respectively by clicking on the "+" or "-" buttons. To label an ant's position, the user simply clicks on the screen and a green dot will appear with the ant ID. The red dots show the labelled ant positions from the previous frame. Again, this is done so that users have an idea of where the ant is going, in case of more crowded areas. The "Submit" button sends the ant coordinates to a PostgreSQL database. The "Next" and "Previous" buttons show the next and previous frames respectively.

![landing-page](https://github.com/joshsia/Ants/blob/main/ui_images/tracking-page.png)

For a more detailed explanation of our UI, please see our report here.

## Credits
This project was supervised by Dr David Labonte, Mr Fabian Plum and Mr Martin Holloway at Imperial College London.
