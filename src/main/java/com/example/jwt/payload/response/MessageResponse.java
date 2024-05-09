package com.example.jwt.payload.response;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MessageResponse {	
  private String message;

  public MessageResponse(String message) {
    this.message = message;
  }


}
