package com.adobe.phonegap.push;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.android.gms.tasks.OnSuccessListener;

import static com.adobe.phonegap.push.PushConstants.*;

public class PushInstanceIDListenerService extends FirebaseMessagingService {
  public static final String LOG_TAG = "Push_InsIdService";

  @Override
  public void onNewToken (String s) {
    super.onNewToken(s);

//    FirebaseInstanceId.getInstance().getInstanceId()
//      .addOnSuccessListener(new OnSuccessListener<InstanceIdResult>() {
//        @Override
//        public void onSuccess (InstanceIdResult instanceIdResult) {
          // Get updated InstanceID token.
//          String refreshedToken = instanceIdResult.getToken();

//          Log.d(LOG_TAG, "Refreshed token: " + refreshedToken);

          // TODO: Implement this method to send any registration to your app's servers.
          //sendRegistrationToServer(refreshedToken);
//        }
//      });
  }
}
