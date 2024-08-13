package com.example.assignmnet3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlin.random.Random

class DailyQuoteFragment : Fragment() {

    // List of predefined motivational quotes
    private val quotes = listOf(
        "Believe you can and you're halfway there.",
        "The only way to do great work is to love what you do.",
        "Don't watch the clock; do what it does. Keep going.",
        "Success is not how high you have climbed, but how you make a positive difference.",
        "Your limitation—it's only your imagination.",
        "Push yourself, because no one else is going to do it for you.",
        "Sometimes later becomes never. Do it now.",
        "Great things never come from comfort zones.",
        "Dream it. Wish it. Do it.",
        "Stay positive, work hard, make it happen."
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_daily_quote, container, false)

        // Find the TextView and set a random quote with the prefix "Daily Quote:"
        val quoteTextView = view.findViewById<TextView>(R.id.textViewQuote)
        val randomQuote = getRandomQuote()
        quoteTextView.text = "Daily Quote:\n$randomQuote"

        return view
    }

    private fun getRandomQuote(): String {
        // Randomly select and return a quote from the list
        return quotes[Random.nextInt(quotes.size)]
    }
}
