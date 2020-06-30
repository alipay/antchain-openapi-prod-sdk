<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class QueryClassUserResponse extends Model {
    protected $_name = [
        'className' => 'class_name',
        'orgUserIdList' => 'org_user_id_list',
        'userNum' => 'user_num',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
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
     * @return QueryClassUserResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
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
     * @description 班级名称
     * @example 101班
     * @var string
     */
    public $className;

    /**
     * @description 企业用户id列表
     * @example 0001
     * @var array
     */
    public $orgUserIdList;

    /**
     * @description 学员数量
     * @example 100
     * @var integer
     */
    public $userNum;

}
