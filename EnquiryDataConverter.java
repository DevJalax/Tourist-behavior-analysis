package converter;

import csv.model.EnquiryData;
import elastic.model.Enquiry;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EnquiryDataConverter {

    public static Enquiry convert(EnquiryData csvEnquiryData, String uniqueKey, String user, LocalDateTime uploadedOn) {

        Enquiry enquiry = new Enquiry();

        enquiry.arrival = csvEnquiryData.getArrival().format(DateTimeFormatter.ISO_LOCAL_DATE);
        enquiry.departure = csvEnquiryData.getDeparture().format(DateTimeFormatter.ISO_LOCAL_DATE);
        enquiry.country = csvEnquiryData.getCountry();
        enquiry.adults = csvEnquiryData.getAdults();
        enquiry.children = csvEnquiryData.getChildren();
        enquiry.destination = csvEnquiryData.getDestination();
        enquiry.category = csvEnquiryData.getCategory();
        enquiry.booking = csvEnquiryData.getBooking();
        enquiry.cancellation = csvEnquiryData.getCancellation();
        enquiry.submittedOn = csvEnquiryData.getSubmittedOn().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        enquiry.lengthOfStay = csvEnquiryData.getLengthOfStay();
        enquiry.uniqueKey = uniqueKey;
        enquiry.hashCode = csvEnquiryData.getHash();
        enquiry.user = user;
        enquiry.daysBeforeArrival = csvEnquiryData.getDaysBeforeArrival();
        enquiry.uploadedOn = uploadedOn.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        return enquiry;
    }
}

