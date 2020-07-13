<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class QueryAasEbcClassUserResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'className' => 'class_name',
        'orgUserIdList' => 'org_user_id_list',
        'userNum' => 'user_num',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->className) {
            $res['class_name'] = $this->className;
        }
        if (null !== $this->orgUserIdList) {
            $res['org_user_id_list'] = [];
            if(null !== $this->orgUserIdList){
                $res['org_user_id_list'] = $this->orgUserIdList;
            }
        }
        if (null !== $this->userNum) {
            $res['user_num'] = $this->userNum;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAasEbcClassUserResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['class_name'])){
            $model->className = $map['class_name'];
        }
        if(isset($map['org_user_id_list'])){
            if(!empty($map['org_user_id_list'])){
                $model->orgUserIdList = [];
                $model->orgUserIdList = $map['org_user_id_list'];
            }
        }
        if(isset($map['user_num'])){
            $model->userNum = $map['user_num'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 班级名称
    /**
     * @var string
     */
    public $className;

    // 企业用户id列表
    /**
     * @var array
     */
    public $orgUserIdList;

    // 学员数量
    /**
     * @var integer
     */
    public $userNum;

}
