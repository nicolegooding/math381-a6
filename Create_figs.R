setwd("~/Desktop/Autumn 2021/Math 381/math381-a6")

convergence <- read.csv("convergence.csv")
histogram <- read.csv("histogram.csv")

x <- 1:10000

png(file="convergence_plot.png",
    width=1000, height=600)

plot(x, convergence$run1, ylim = c(0.1, 0.4), type = "l", 
     xlab = "number of trials", ylab = "probability of winning")
lines(x, convergence$run2)
lines(x, convergence$run3)
lines(x, convergence$run4)
lines(x, convergence$run5)
lines(x, convergence$run6)
lines(x, convergence$run7)
lines(x, convergence$run8)
lines(x, convergence$run9)
lines(x, convergence$run10)
dev.off()

png(file="probabilities_histogram.png",
    width=1000, height=600)

hist(histogram$probability.histogram, 
     main = "Histogram of the probability of winning", 
     sub = "red line is the mean probability of winning", 
     cex.sub = .75,
     xlab = "probability of winning",
     ylab = "frequency", breaks = 20)
abline(v = mean(histogram$probability.histogram),                       # Add line for mean
       col = "red",
       lwd = 1)
dev.off()