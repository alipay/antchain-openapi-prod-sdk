<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\EBC\Models\OrgUser;

class QueryBaasEbcOrganizationUserResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'orgUserList' => 'org_user_list',
        'pages' => 'pages',
        'pageNum' => 'page_num',
        'total' => 'total',
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
        if (null !== $this->orgUserList) {
            $res['org_user_list'] = [];
            if(null !== $this->orgUserList && is_array($this->orgUserList)){
                $n = 0;
                foreach($this->orgUserList as $item){
                    $res['org_user_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pages) {
            $res['pages'] = $this->pages;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBaasEbcOrganizationUserResponse
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
        if(isset($map['org_user_list'])){
            if(!empty($map['org_user_list'])){
                $model->orgUserList = [];
                $n = 0;
                foreach($map['org_user_list'] as $item) {
                    $model->orgUserList[$n++] = null !== $item ? OrgUser::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['pages'])){
            $model->pages = $map['pages'];
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['total'])){
            $model->total = $map['total'];
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

    // 企业用户列表
    /**
     * @var OrgUser[]
     */
    public $orgUserList;

    // 总页数
    /**
     * @var int
     */
    public $pages;

    // 当前页码
    /**
     * @var int
     */
    public $pageNum;

    // 数据总量
    /**
     * @var int
     */
    public $total;

}
