interface CAMERA {
    void capture();
}

interface Video {
    void capture();
}

class MobileCQ implements CAMERA, Video {  // INTERFACE CLASS QUESTION
    
    // Implementing common method
    public void capture() {
        System.out.println("Capturing photo and video...");
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.capture();
    }
}