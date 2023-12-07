package designpatterns.facade;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodeType();
        if(type.equals("mp4")) {
            System.out.println("CodeFactory : extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodeFactory : extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
    
}
