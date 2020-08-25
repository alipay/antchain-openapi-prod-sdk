<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\EBC\Models\Class_;

class DeleteBaasEbcCourseClassRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'classList' => 'class_list',
        'courseId' => 'course_id',
        'orgDid' => 'org_did',
    ];
    public function validate() {
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
        if (null !== $this->classList) {
            $res['class_list'] = [];
            if(null !== $this->classList && is_array($this->classList)){
                $n = 0;
                foreach($this->classList as $item){
                    $res['class_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
     * @return DeleteBaasEbcCourseClassRequest
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
        if(isset($map['class_list'])){
            if(!empty($map['class_list'])){
                $model->classList = [];
                $n = 0;
                foreach($map['class_list'] as $item) {
                    $model->classList[$n++] = null !== $item ? Class_::fromMap($item) : $item;
                }
            }
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

    // 班级列表,最多一次传入50个
    /**
     * @var array
     */
    public $classList;

    // 课程id
    /**
     * @var string
     */
    public $courseId;

    // 企业id
    /**
     * @var string
     */
    public $orgDid;

}
