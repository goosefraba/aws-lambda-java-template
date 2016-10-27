package at.goosefraba.aws.lambda.template;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;

/**
 * Copyright goosefraba.at
 * Created by goosefraba on 27/10/2016.
 */
public class Application implements RequestHandler<S3Event, String> {

    /**
     * Example implementation for processing an S3 event.
     *
     * @param s3Event the event object.
     * @param context the AWS lambda context object.
     * @return a response code.
     */
    @Override
    public String handleRequest(S3Event s3Event, Context context) {
        return "ok";
    }
}
