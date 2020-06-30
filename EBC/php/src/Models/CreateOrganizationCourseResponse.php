<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CreateOrganizationCourseResponse extends Model {
    protected $_name = [
        'courseId' => 'course_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->courseId) {
            $res['course_id'] = $this->courseId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateOrganizationCourseResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['course_id'])){
            $model->courseId = $map['course_id'];
        }
        return $model;
    }
    /**
     * @description 课程did
     * @example 0001
     * @var string
     */
    public $courseId;

}
