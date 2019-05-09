package run.halo.app.service.support;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.MediaType;

import java.nio.charset.Charset;
import java.util.Map;

/**
 * Halo Media type.
 *
 * @author johnniang
 * @date 19-4-18
 */
@Slf4j
public class HaloMediaType extends MediaType {

    /**
     * Public constant media type of {@code application/zip}
     */
    public static final MediaType APPLICATION_ZIP;

    /**
     * A String equivalent of {@link HaloMediaType#APPLICATION_ZIP}
     */
    public static final String APPLICATION_ZIP_VALUE = "application/zip";

    public static final MediaType APPLICATION_GIT;

    public static final String APPLICATION_GIT_VALUE = "application/git";


    static {
        APPLICATION_ZIP = valueOf(APPLICATION_ZIP_VALUE);
        APPLICATION_GIT = valueOf(APPLICATION_GIT_VALUE);
    }

    public HaloMediaType(String type) {
        super(type);
    }

    public HaloMediaType(String type, String subtype) {
        super(type, subtype);
    }

    public HaloMediaType(String type, String subtype, Charset charset) {
        super(type, subtype, charset);
    }

    public HaloMediaType(String type, String subtype, double qualityValue) {
        super(type, subtype, qualityValue);
    }

    public HaloMediaType(MediaType other, Charset charset) {
        super(other, charset);
    }

    public HaloMediaType(MediaType other, Map<String, String> parameters) {
        super(other, parameters);
    }

    public HaloMediaType(String type, String subtype, Map<String, String> parameters) {
        super(type, subtype, parameters);
    }

    /**
     * Checks whether the media type is zip type or not .
     *
     * @param mediaType media type
     * @return true if the given media type is zip type; false otherwise
     */
    @Deprecated
    public static boolean isZipType(MediaType mediaType) {
        if (mediaType == null) {
            return false;
        }

        return mediaType.includes(APPLICATION_ZIP);
    }

    /**
     * Checks whether the media type is zip type or not .
     *
     * @param contentType content type
     * @return true if the given content type is zip type; false otherwise
     */
    @Deprecated
    public static boolean isZipType(String contentType) {
        if (StringUtils.isBlank(contentType)) {
            return false;
        }

        return isZipType(valueOf(contentType));
    }
}
