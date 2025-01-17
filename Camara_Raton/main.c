#include "muse.h"

int main() {
    cv::VideoCapture cap(0); 
    if (!cap.isOpened()) {
        return -1;
    }

    cv::Mat frame;
    while (true) {
        cap >> frame; 
        if (frame.empty()) {
            break;
        }

        
        int handX = 100; 
        int handY = 100; 

        
        moveMouse(handX, handY);

        
        bool isFingerClicking = true;

        if (isFingerClicking) {
            clickMouse();
        }

 
        cv::imshow("Frame", frame);
        if (cv::waitKey(30) >= 0) {
            break;
        }
    }

    return 0;
}