<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CreateBaasEbcCourseChapterRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'chapterBizId' => 'chapter_biz_id',
        'chapterDescription' => 'chapter_description',
        'chapterName' => 'chapter_name',
        'chapterPeriod' => 'chapter_period',
        'courseId' => 'course_id',
        'orgDid' => 'org_did',
    ];
    public function validate() {
        Model::validateMaxLength('chapterBizId', $this->chapterBizId, 128);
        Model::validateMaxLength('chapterDescription', $this->chapterDescription, 2000);
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
        if (null !== $this->chapterBizId) {
            $res['chapter_biz_id'] = $this->chapterBizId;
        }
        if (null !== $this->chapterDescription) {
            $res['chapter_description'] = $this->chapterDescription;
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
     * @return CreateBaasEbcCourseChapterRequest
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
        if(isset($map['chapter_biz_id'])){
            $model->chapterBizId = $map['chapter_biz_id'];
        }
        if(isset($map['chapter_description'])){
            $model->chapterDescription = $map['chapter_description'];
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

    // 业务系统章节ID
    /**
     * @var string
     */
    public $chapterBizId;

    // 章节描述
    /**
     * @var string
     */
    public $chapterDescription;

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

    // 课程id
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
