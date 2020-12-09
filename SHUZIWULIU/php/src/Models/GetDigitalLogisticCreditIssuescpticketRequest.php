<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SHUZIWULIU\Models\ScpTicketIssueData;

class GetDigitalLogisticCreditIssuescpticketRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'applyId' => 'apply_id',
        'callbackUrl' => 'callback_url',
        'groupPlatformDid' => 'group_platform_did',
        'platformDid' => 'platform_did',
        'productId' => 'product_id',
        'scpTicketIssueData' => 'scp_ticket_issue_data',
    ];
    public function validate() {}
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
        if (null !== $this->applyId) {
            $res['apply_id'] = $this->applyId;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->scpTicketIssueData) {
            $res['scp_ticket_issue_data'] = [];
            if(null !== $this->scpTicketIssueData && is_array($this->scpTicketIssueData)){
                $n = 0;
                foreach($this->scpTicketIssueData as $item){
                    $res['scp_ticket_issue_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetDigitalLogisticCreditIssuescpticketRequest
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
        if(isset($map['apply_id'])){
            $model->applyId = $map['apply_id'];
        }
        if(isset($map['callback_url'])){
            $model->callbackUrl = $map['callback_url'];
        }
        if(isset($map['group_platform_did'])){
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if(isset($map['platform_did'])){
            $model->platformDid = $map['platform_did'];
        }
        if(isset($map['product_id'])){
            $model->productId = $map['product_id'];
        }
        if(isset($map['scp_ticket_issue_data'])){
            if(!empty($map['scp_ticket_issue_data'])){
                $model->scpTicketIssueData = [];
                $n = 0;
                foreach($map['scp_ticket_issue_data'] as $item) {
                    $model->scpTicketIssueData[$n++] = null !== $item ? ScpTicketIssueData::fromMap($item) : $item;
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

    // 申请唯一流水号
    /**
     * @var string
     */
    public $applyId;

    // 回调地址
    /**
     * @var string
     */
    public $callbackUrl;

    // 集团平台方分布式数字身份
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 业务发起方分布式数字身
    /**
     * @var string
     */
    public $platformDid;

    // 产品id
    /**
     * @var string
     */
    public $productId;

    // 电子回单查询凭证数据
    /**
     * @var ScpTicketIssueData[]
     */
    public $scpTicketIssueData;

}
