import {NgModule} from "@angular/core";
import { AboutComponent } from "./about/about.component";
import {RouterModule, Routes} from '@angular/router';
import { EducationComponent } from "./education/education.component";
import { ProjectsComponent } from "./projects/projects.component";
import { SkillsComponent } from "./skills/skills.component";
import { GalleryComponent } from "./gallery/gallery.component";
import { ContactComponent } from "./contact/contact.component";
import { FootercomponentComponent } from "./footercomponent/footercomponent.component";

const routes:Routes=[
    {path:'about',component: AboutComponent},
    {path:'education',component: EducationComponent},
    {path:'projects',component: ProjectsComponent},
    {path:'skills',component: SkillsComponent},
    {path:'gallery',component: GalleryComponent},
    {path:'footercomponent',component: FootercomponentComponent},
    {path:'contact',component: ContactComponent}
]


@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports:[RouterModule]
})
export class AppRoutingModule{}