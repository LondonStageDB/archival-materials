Created by Mattie Burkert with support from Brianna Marshall and William Daland.
---------------------------------------

FILE INFORMATION

I. Dataset history

These data were retrieved from the Lawrence University Archives in Appleton, WI on September 15, 2014 by Mattie Burkert, with the assistance of University Archivist Erin Dix. 

The files contained here represent a database constructed at Lawrence University between 1970 and 1978, under the direction of Professor Ben Ross Schneider, Jr. That database was titled “The London Stage Information Bank,” and it was in turn based on The London Stage, 1660-1800: a calendar of plays, entertainments & afterpieces, together with casts, box-receipts and contemporary comment. Compiled from the playbills, newspapers and theatrical diaries of the period [http://catalog.hathitrust.org/Record/000200105]. This 11-volume, 8000-page reference book published by Southern Illinois University Press between 1960 and 1968. 

In 1970, Schneider was approached to create a computer index of the entire reference series. After 9 years, he produced The Index to The London Stage (SIU Press, 1979) [http://catalog.hathitrust.org/Record/000299859]. In the process, he and an extensive team of typists, editors, and programmers produced the Information Bank, a version of which is represented in these files.


II. Specifics of data

The workflow for the creation of the data was as follows: 

* Schneider and several graduate student editors used colored pencils to mark up pages of the reference book, identifying particular types of entities (headers, cast lists, extraneous information) that were to be coded in specific ways. 

* The pages were sent to China Data Systems in Hong Kong, where typists transcribed the marked-up text in an OCR-friendly font called OCRB, ??edit
enhanced somewhat by Dr. Schneider's machining of the IBM Selectric typeballs. The typists also coded the editorial markups, and standardized certain elements such as punctuation.

* The corrected and standardized text was ??("printed and" deleted) sent to Information Control Incorporated in Kansas City, where it underwent Optical Character Recognition. The results were stored on magnetic tapes in EBCDIC suitable for an IBM System/360 using the OS/360 Operating System.

* Once the tapes containing the OCR’d text were returned to Appleton, a program called ICIFIX (created by Will Daland) was used to perform additional correction and standardization.  This was a simple program that ran interactively using the OS/360 operator's console.

* Later, Undergraduate student editors used a word-processing program developed specifically for this project (SITAR) to edit the resulting text,  reducing errors and inconsistencies more efficiently in an iterative process.

In order to produce the structure necessary to produce the Index, the data was run through several other programs developed by Daland in PL/1, which were combined into a system stored on an IBM 2311 disk called GWSJR1, named after George Winchester Stone Jr. one of the five authors of the London Stage volumes, who contributed money to pay for the disk.  
The Information Bank was intended to be maintained at Lawrence University. In 1983, when Lawrence ceased to maintain a computer capable of reading the tapes on which the Information Bank was stored, the tapes were transferred to the Harvard Theater Collection. The HTC gave the tapes to their IT department to be migrated onto a new medium, at which point they were lost. 

The present files were found stored on 3.5” floppy discs that appeared to have been written in 1990 at Lawrence University. No documentation of the specific provenance of these discs accompanied them, nor did a search through the IT department or Archive logs turn up evidence of the chain of transmission.

As of 6/2/2015 it is thought that the data available in the present files may have been run through the LSP System.  However it is possible that this data is essentially an ASCII version of the raw data as it arrived from ICI as EBCDIC data on magnetic tapes, or it may be anything in between.

File extensions: The files in LSP_data.zip have idiosyncratic extensions (.LSP, .NPK), but can be opened in plain text editors like Notepad.

Markup conventions: Documentation was retrieved from the Lawrence Archives that indicates the “box codes” used by the typists to demarcate particular kinds of information, which may be useful in understanding the present files. For instance, *p is placed at the beginning of the performance header, which includes the title of mainpiece and its cast list. *a is placed before the afterpiece title and cast list. *d corresponds to dancing, *s to singing, *m to music, and *e to entertainment. Each of these “boxes” includes a list of performer and piece performed (e.g. singer – song). *c is the code for additional comments from the editors of the volumes. 

Additional documentation of the data’s syntax can be accessed through the Lawrence University Archives.

The documentation and source code of the LSP software is available, but only in printed image format, not ASCII or EBCDIC text files.

As of 6/2/15, Will Daland and Mattie Burkert are working on restoring this software to a runnable form.


III. Contributors to data
Compilers and editors of the original reference series, and Advisory Board of the London Stage Information Bank: William Van Lennep, Emmett L. Avery,
Arthur H. Scouten, George Winchester Stone Jr., and Charles Beecher Hogan

Additional Advisory Board Members: Allardyce Nicoll, Sybil Rosenfeld, Cecil Price, Philip Highfill, Kalman Burnim, Carl Stratman, John Robinson, William Armstrong

Head of the London Stage Information Bank project: Ben Ross Schneider, Jr.

Graduate student markup editors: Leonard Leff, Marchia Heinemann, Muriel Friedman, and Mark Auburn

Additional non-specialist markup editors: Devon Schneider, Ben Schneider III, Dorothy Church

Typists at China Data Systems: names unknown

Programmers: Will Daland (devised markup conventions and developed processing programs for data processing), Reid Watts (developed word-processing software for editing the data, i.e. SITAR), Walter Brown, Nick Schneider

Undergraduate Research Assistant: Cynthia Persak (executed the data entry and data processing programs, starting with the magnetic tapes from ICIFIX, and produced files suitable for executing the information retrieval program)

Undergraduate editors: Catherine Boggs, Catherine Steiner, Marc Weinberger, Joseph Jacobs, Ruth Steiner, Connie Hansen, Sarah Larsen, Laurie Johnson, Sue Kock, Peter Pretkel, Lynn Seifert, Louise Freiberg, Elizabeth O’Brien, Jan Surkamp, Mark Burrows, Kathy Rosner

Other contributors: Debbie Watts, Mackay Taylor Schneider, Scott Farnsworth, Marc Weinberger, Suzanne Fusso, Melinda Young

Funders: The project cost approximately $200,000 to complete. Funding was provided by the National Endowment for the Humanities, the American Council of Learned Societies, the American Philosophical Society, the Andrew Mellon Foundation, the United States Steel Foundation, the Billy Rose Foundation, Lawrence University, and individual gifts from Mrs. John A. Logan, Charles Beecher Hogan, Faith Bradford, Dr. and Mrs. J. Merrill Knapp Jr., and an anonymous Friend of Lawrence University.


LIMITATIONS

There are a number of possible issues with the files. For example, the dates seem to be missing or damaged in many of the performance headers. Numerals appear to have been replaced with special characters. This may have happened when the data were migrated to floppies or at another point. Investigation into correcting the data is ongoing. Use these data with caution.

©
