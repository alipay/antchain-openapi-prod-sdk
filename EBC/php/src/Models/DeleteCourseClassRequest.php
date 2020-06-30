<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\EBC\Models\Class_;

class DeleteCourseClassRequest extends Model {
    protected $_name = [
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
     * @return DeleteCourseClassRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
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
     * @description 班级列表,最多一次传入50个
     * @example 
     * @var array
     */
    public $classList;

    /**
     * @description 课程id
     * @example 0001
     * @var string
     */
    public $courseId;

    /**
     * @description 企业id
     * @example did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36 
     * @var string
     */
    public $orgDid;

}
