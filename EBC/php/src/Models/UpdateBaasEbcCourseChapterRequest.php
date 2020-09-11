<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class UpdateBaasEbcCourseChapterRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'chapterDescription' => 'chapter_description',
        'chapterId' => 'chapter_id',
        'chapterName' => 'chapter_name',
        'chapterPeriod' => 'chapter_period',
        'courseId' => 'course_id',
        'orgDid' => 'org_did',
    ];
    public function validate() {
        Model::validateMaxLength('chapterDescription', $this->chapterDescription, 2000);
        Model::validateMaxLength('chapterId', $this->chapterId, 128);
        Model::validateMaxLength('chapterName', $this->chapterName, 128);
        Model::validateMaxLength('courseId', $this->courseId, 128);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->chapterDescription) {
            $res['chapter_description'] = $this->chapterDescription;
        }
        if (null !== $this->chapterId) {
            $res['chapter_id'] = $this->chapterId;
        }
        if (null !== $this->chapterName) {
            $res['chapter_name'] = $this->chapterName;
        }
        if (null !== $this->chapterPeriod) {
            $res['chapter_period'] = $this->chapterPeriod;
        }
        if (null !== $this->courseId) {
            $res['course_id'] = $this->courseId;
        }
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateBaasEbcCourseChapterRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['chapter_description'])){
            $model->chapterDescription = $map['chapter_description'];
        }
        if(isset($map['chapter_id'])){
            $model->chapterId = $map['chapter_id'];
        }
        if(isset($map['chapter_name'])){
            $model->chapterName = $map['chapter_name'];
        }
        if(isset($map['chapter_period'])){
            $model->chapterPeriod = $map['chapter_period'];
        }
        if(isset($map['course_id'])){
            $model->courseId = $map['course_id'];
        }
        if(isset($map['org_did'])){
            $model->orgDid = $map['org_did'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 章节描述
    /**
     * @var string
     */
    public $chapterDescription;

    // 链上章节id
    /**
     * @var string
     */
    public $chapterId;

    // 章节名称
    /**
     * @var string
     */
    public $chapterName;

    // 章节时长，单位秒
    /**
     * @var int
     */
    public $chapterPeriod;

    // 链上课程id
    /**
     * @var string
     */
    public $courseId;

    // 企业链上did
    /**
     * @var string
     */
    public $orgDid;

}
