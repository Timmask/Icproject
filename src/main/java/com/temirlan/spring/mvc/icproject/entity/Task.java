package com.temirlan.spring.mvc.icproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "external_id")
    private Integer externalId;

    @Column(name = "deleted")
    private Boolean deleted;

    
    @Column(name = "\"group\"")
    private String group;

    @Column(name = "sub_status")
    private Integer subStatus;

    
    
    @Column(name = "creator")
    private String creator;

    
    
    @Column(name = "responsible")
    private String responsible;

    
    
    @Column(name = "description_in_bbcode")
    private String descriptionInBbcode;

    
    
    @Column(name = "accomplices_data")
    private String accomplicesData;

    
    
    @Column(name = "auditors_data")
    private String auditorsData;

    @Column(name = "parent_id")
    private Double parentId;

    
    
    @Column(name = "title")
    private String title;

    
    
    @Column(name = "description")
    private String description;

    
    
    @Column(name = "mark")
    private String mark;

    
    
    @Column(name = "priority")
    private String priority;

    
    
    @Column(name = "status")
    private String status;

    
    
    @Column(name = "multitask")
    private String multitask;

    
    
    @Column(name = "not_viewed")
    private String notViewed;

    
    
    @Column(name = "replicate")
    private String replicate;

    @Column(name = "group_id")
    private Double groupId;

    @Column(name = "stage_id")
    private Double stageId;

    @Column(name = "created_by")
    private Double createdBy;

    @Column(name = "created_date")
    private Instant createdDate;

    @Column(name = "responsible_id")
    private Double responsibleId;

    
    
    @Column(name = "accomplices")
    private String accomplices;

    
    
    @Column(name = "auditors")
    private String auditors;

    @Column(name = "changed_by")
    private Double changedBy;

    @Column(name = "changed_date")
    private Instant changedDate;

    @Column(name = "status_changed_by")
    private Double statusChangedBy;

    @Column(name = "status_changed_date")
    private Instant statusChangedDate;

    @Column(name = "closed_by")
    private Double closedBy;

    @Column(name = "closed_date")
    private Instant closedDate;

    @Column(name = "activity_date")
    private Instant activityDate;

    @Column(name = "date_start")
    private Instant dateStart;

    @Column(name = "deadline")
    private Instant deadline;

    @Column(name = "start_date_plan")
    private Instant startDatePlan;

    @Column(name = "end_date_plan")
    private Instant endDatePlan;

    
    
    @Column(name = "guid")
    private String guid;

    
    
    @Column(name = "xml_id")
    private String xmlId;

    @Column(name = "comments_count")
    private Double commentsCount;

    @Column(name = "service_comments_count")
    private Double serviceCommentsCount;

    @Column(name = "new_comments_count")
    private Double newCommentsCount;

    
    
    @Column(name = "allow_change_deadline")
    private String allowChangeDeadline;

    
    
    @Column(name = "allow_time_tracking")
    private String allowTimeTracking;

    
    
    @Column(name = "task_control")
    private String taskControl;

    
    
    @Column(name = "add_in_report")
    private String addInReport;

    
    
    @Column(name = "forked_by_template_id")
    private String forkedByTemplateId;

    @Column(name = "time_estimate")
    private Double timeEstimate;

    @Column(name = "time_spent_in_logs")
    private Double timeSpentInLogs;

    @Column(name = "match_work_time")
    private Double matchWorkTime;

    @Column(name = "forum_topic_id")
    private Double forumTopicId;

    @Column(name = "forum_id")
    private Double forumId;

    
    
    @Column(name = "site_id")
    private String siteId;

    
    
    @Column(name = "subordinate")
    private String subordinate;

    
    
    @Column(name = "favorite")
    private String favorite;

    @Column(name = "exchange_modified")
    private Instant exchangeModified;

    @Column(name = "exchange_id")
    private Double exchangeId;

    @Column(name = "outlook_version")
    private Double outlookVersion;

    @Column(name = "viewed_date")
    private Instant viewedDate;

    @Column(name = "sorting")
    private Double sorting;

    @Column(name = "duration_plan")
    private Double durationPlan;

    @Column(name = "duration_fact")
    private Double durationFact;

    
    
    @Column(name = "checklist")
    private String checklist;

    
    
    @Column(name = "duration_type")
    private String durationType;

    
    
    @Column(name = "is_muted")
    private String isMuted;

    
    
    @Column(name = "is_pinned")
    private String isPinned;

    
    
    @Column(name = "is_pinned_in_group")
    private String isPinnedInGroup;

    @Column(name = "flow_id")
    private Double flowId;

    
    
    @Column(name = "uf_crm_task")
    private String ufCrmTask;

    
    
    @Column(name = "uf_task_webdav_files")
    private String ufTaskWebdavFiles;

    
    
    @Column(name = "uf_mail_message")
    private String ufMailMessage;

    @Column(name = "uf_auto_617653137132")
    private Double ufAuto617653137132;

}