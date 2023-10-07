package Safari;

import Safari.GoogleMaps.GoogleMaps;
import Safari.MailService.MailService;

public class Safari {
  private GoogleMaps googleMaps;
  private MailService mailService;

  public Safari() {
    mailService = new MailService();
    googleMaps = new GoogleMaps();
  }

  public GoogleMaps getGoogleMaps() {
    return googleMaps;
  }

  public MailService getMailService() {
    return mailService;
  }
}
