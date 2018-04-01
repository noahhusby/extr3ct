package main

import (
	"net/http"
	"log"
	"io/ioutil"
	"fmt"
)

func getTextFromURL(webURL string) {
	url := webURL
	response, err := http.Get(url)
	if err != nil {
		log.Fatal(err)
	}
	defer response.Body.Close()

	responseData, err := ioutil.ReadAll(response.Body)
	if err != nil {
		log.Fatal(err)
	}

	responseString := string(responseData)

	fmt.Println(responseString)
}
