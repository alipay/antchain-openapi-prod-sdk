<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class QueryEsgOrganizationunittreeResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'organizationNo' => 'organization_no',
        'organizationName' => 'organization_name',
        'parentOrganizationNoList' => 'parent_organization_no_list',
        'parentOrganizationName' => 'parent_organization_name',
        'gmtModified' => 'gmt_modified',
        'children' => 'children',
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
        if (null !== $this->organizationNo) {
            $res['organization_no'] = $this->organizationNo;
        }
        if (null !== $this->organizationName) {
            $res['organization_name'] = $this->organizationName;
        }
        if (null !== $this->parentOrganizationNoList) {
            $res['parent_organization_no_list'] = $this->parentOrganizationNoList;
        }
        if (null !== $this->parentOrganizationName) {
            $res['parent_organization_name'] = $this->parentOrganizationName;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->children) {
            $res['children'] = $this->children;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryEsgOrganizationunittreeResponse
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
        if(isset($map['organization_no'])){
            $model->organizationNo = $map['organization_no'];
        }
        if(isset($map['organization_name'])){
            $model->organizationName = $map['organization_name'];
        }
        if(isset($map['parent_organization_no_list'])){
            if(!empty($map['parent_organization_no_list'])){
                $model->parentOrganizationNoList = $map['parent_organization_no_list'];
            }
        }
        if(isset($map['parent_organization_name'])){
            $model->parentOrganizationName = $map['parent_organization_name'];
        }
        if(isset($map['gmt_modified'])){
            $model->gmtModified = $map['gmt_modified'];
        }
        if(isset($map['children'])){
            if(!empty($map['children'])){
                $model->children = $map['children'];
            }
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 组织单元编码
    /**
     * @var string
     */
    public $organizationNo;

    // 组织单元名称
    /**
     * @var string
     */
    public $organizationName;

    // 从根到直接父级的组织编码链
    /**
     * @var string[]
     */
    public $parentOrganizationNoList;

    // 直接父级组织名称；根节点为空
    /**
     * @var string
     */
    public $parentOrganizationName;

    // 最后更新时间
    /**
     * @var string
     */
    public $gmtModified;

    // 重复结构体
    /**
     * @var string[]
     */
    public $children;

}
