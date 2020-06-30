<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\EBC\Models\OrgUser;

class AddClassUserRequest extends Model {
    protected $_name = [
        'classId' => 'class_id',
        'orgDid' => 'org_did',
        'orgUserList' => 'org_user_list',
    ];
    public function validate() {
        Model::validateMaxLength('classId', $this->classId, 128);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->classId) {
            $res['class_id'] = $this->classId;
        }
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }
        if (null !== $this->orgUserList) {
            $res['org_user_list'] = [];
            if(null !== $this->orgUserList && is_array($this->orgUserList)){
                $n = 0;
                foreach($this->orgUserList as $item){
                    $res['org_user_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AddClassUserRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['class_id'])){
            $model->classId = $map['class_id'];
        }
        if(isset($map['org_did'])){
            $model->orgDid = $map['org_did'];
        }
        if(isset($map['org_user_list'])){
            if(!empty($map['org_user_list'])){
                $model->orgUserList = [];
                $n = 0;
                foreach($map['org_user_list'] as $item) {
                    $model->orgUserList[$n++] = null !== $item ? OrgUser::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @description 班级id
     * @example 0001
     * @var string
     */
    public $classId;

    /**
     * @description 企业id
     * @example mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36
     * @var string
     */
    public $orgDid;

    /**
     * @description 企业用户列表,最多一次传入50个
     * @example 
     * @var array
     */
    public $orgUserList;

}
