package com.example.demo.Test

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class TestController {
	@GetMapping("/")
	fun test(model: Model): String{
		model["title"] = "testTitle"
		return "index"
	}
}