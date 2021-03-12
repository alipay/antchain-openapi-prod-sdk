<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDigitalassetExchangeEpstockissueRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 版通代码
    /**
     * @var string
     */
    public $epCode;

    // 版通发行方账户
    /**
     * @var string
     */
    public $epIssueAccount;

    // 版通存量发行线下量
    /**
     * @var int
     */
    public $epOfflineIssueAmount;

    // 版通存量发行线上量
    /**
     * @var int
     */
    public $epOnlineIssueAmount;

    // 版通存量发行自持量
    /**
     * @var int
     */
    public $epSelfIssueAmount;

    // 交易所代码
    /**
     * @var string
     */
    public $exchangeCode;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'epCode'               => 'ep_code',
        'epIssueAccount'       => 'ep_issue_account',
        'epOfflineIssueAmount' => 'ep_offline_issue_amount',
        'epOnlineIssueAmount'  => 'ep_online_issue_amount',
        'epSelfIssueAmount'    => 'ep_self_issue_amount',
        'exchangeCode'         => 'exchange_code',
    ];

    public function validate()
    {
        Model::validateRequired('epCode', $this->epCode, true);
        Model::validateRequired('epIssueAccount', $this->epIssueAccount, true);
        Model::validateRequired('epOfflineIssueAmount', $this->epOfflineIssueAmount, true);
        Model::validateRequired('epOnlineIssueAmount', $this->epOnlineIssueAmount, true);
        Model::validateRequired('epSelfIssueAmount', $this->epSelfIssueAmount, true);
        Model::validateRequired('exchangeCode', $this->exchangeCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->epCode) {
            $res['ep_code'] = $this->epCode;
        }
        if (null !== $this->epIssueAccount) {
            $res['ep_issue_account'] = $this->epIssueAccount;
        }
        if (null !== $this->epOfflineIssueAmount) {
            $res['ep_offline_issue_amount'] = $this->epOfflineIssueAmount;
        }
        if (null !== $this->epOnlineIssueAmount) {
            $res['ep_online_issue_amount'] = $this->epOnlineIssueAmount;
        }
        if (null !== $this->epSelfIssueAmount) {
            $res['ep_self_issue_amount'] = $this->epSelfIssueAmount;
        }
        if (null !== $this->exchangeCode) {
            $res['exchange_code'] = $this->exchangeCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDigitalassetExchangeEpstockissueRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['ep_code'])) {
            $model->epCode = $map['ep_code'];
        }
        if (isset($map['ep_issue_account'])) {
            $model->epIssueAccount = $map['ep_issue_account'];
        }
        if (isset($map['ep_offline_issue_amount'])) {
            $model->epOfflineIssueAmount = $map['ep_offline_issue_amount'];
        }
        if (isset($map['ep_online_issue_amount'])) {
            $model->epOnlineIssueAmount = $map['ep_online_issue_amount'];
        }
        if (isset($map['ep_self_issue_amount'])) {
            $model->epSelfIssueAmount = $map['ep_self_issue_amount'];
        }
        if (isset($map['exchange_code'])) {
            $model->exchangeCode = $map['exchange_code'];
        }

        return $model;
    }
}
