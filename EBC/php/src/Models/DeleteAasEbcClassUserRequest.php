<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\EBC\Models\OrgUser;

class DeleteAasEbcClassUserRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
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
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
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
     * @return DeleteAasEbcClassUserRequest
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

    // 班级id
    /**
     * @var string
     */
    public $classId;

    // 企业id
    /**
     * @var string
     */
    public $orgDid;

    // 企业用户列表,最多一次传入50个
    /**
     * @var array
     */
    public $orgUserList;

}
