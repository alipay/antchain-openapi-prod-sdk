<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDigitalassetExchangeEpissueRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 版通锚定物
    /**
     * @var string
     */
    public $epAnchor;

    // 版通代码
    /**
     * @var string
     */
    public $epCode;

    // 版通首发量
    /**
     * @var int
     */
    public $epFirstAmount;

    // 版通发行方账户
    /**
     * @var string
     */
    public $epIssueAccount;

    // 版通发行时间戳
    /**
     * @var int
     */
    public $epIssueDate;

    // 版通名称
    /**
     * @var string
     */
    public $epName;

    // 版通线下发行配额
    /**
     * @var int
     */
    public $epOfflineIssueAmount;

    // 版通线下日解限比例
    /**
     * @var int
     */
    public $epOfflineUnfreeze;

    // 版通线上发行配额
    /**
     * @var int
     */
    public $epOnlineIssueAmount;

    // 发行方版通自持量
    /**
     * @var int
     */
    public $epSelfAmount;

    // 发行方版通日解限比例
    /**
     * @var int
     */
    public $epSelfUnfreeze;

    // 版通发行数量
    /**
     * @var int
     */
    public $epTotalAmount;

    // 版通类型
    /**
     * @var string
     */
    public $epType;

    // 交易所代码
    /**
     * @var string
     */
    public $exchangeCode;

    // 预留扩展字段
    /**
     * @var string
     */
    public $extend;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'epAnchor'             => 'ep_anchor',
        'epCode'               => 'ep_code',
        'epFirstAmount'        => 'ep_first_amount',
        'epIssueAccount'       => 'ep_issue_account',
        'epIssueDate'          => 'ep_issue_date',
        'epName'               => 'ep_name',
        'epOfflineIssueAmount' => 'ep_offline_issue_amount',
        'epOfflineUnfreeze'    => 'ep_offline_unfreeze',
        'epOnlineIssueAmount'  => 'ep_online_issue_amount',
        'epSelfAmount'         => 'ep_self_amount',
        'epSelfUnfreeze'       => 'ep_self_unfreeze',
        'epTotalAmount'        => 'ep_total_amount',
        'epType'               => 'ep_type',
        'exchangeCode'         => 'exchange_code',
        'extend'               => 'extend',
    ];

    public function validate()
    {
        Model::validateRequired('epAnchor', $this->epAnchor, true);
        Model::validateRequired('epCode', $this->epCode, true);
        Model::validateRequired('epFirstAmount', $this->epFirstAmount, true);
        Model::validateRequired('epIssueAccount', $this->epIssueAccount, true);
        Model::validateRequired('epIssueDate', $this->epIssueDate, true);
        Model::validateRequired('epName', $this->epName, true);
        Model::validateRequired('epOfflineIssueAmount', $this->epOfflineIssueAmount, true);
        Model::validateRequired('epOfflineUnfreeze', $this->epOfflineUnfreeze, true);
        Model::validateRequired('epOnlineIssueAmount', $this->epOnlineIssueAmount, true);
        Model::validateRequired('epSelfAmount', $this->epSelfAmount, true);
        Model::validateRequired('epSelfUnfreeze', $this->epSelfUnfreeze, true);
        Model::validateRequired('epTotalAmount', $this->epTotalAmount, true);
        Model::validateRequired('epType', $this->epType, true);
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
        if (null !== $this->epAnchor) {
            $res['ep_anchor'] = $this->epAnchor;
        }
        if (null !== $this->epCode) {
            $res['ep_code'] = $this->epCode;
        }
        if (null !== $this->epFirstAmount) {
            $res['ep_first_amount'] = $this->epFirstAmount;
        }
        if (null !== $this->epIssueAccount) {
            $res['ep_issue_account'] = $this->epIssueAccount;
        }
        if (null !== $this->epIssueDate) {
            $res['ep_issue_date'] = $this->epIssueDate;
        }
        if (null !== $this->epName) {
            $res['ep_name'] = $this->epName;
        }
        if (null !== $this->epOfflineIssueAmount) {
            $res['ep_offline_issue_amount'] = $this->epOfflineIssueAmount;
        }
        if (null !== $this->epOfflineUnfreeze) {
            $res['ep_offline_unfreeze'] = $this->epOfflineUnfreeze;
        }
        if (null !== $this->epOnlineIssueAmount) {
            $res['ep_online_issue_amount'] = $this->epOnlineIssueAmount;
        }
        if (null !== $this->epSelfAmount) {
            $res['ep_self_amount'] = $this->epSelfAmount;
        }
        if (null !== $this->epSelfUnfreeze) {
            $res['ep_self_unfreeze'] = $this->epSelfUnfreeze;
        }
        if (null !== $this->epTotalAmount) {
            $res['ep_total_amount'] = $this->epTotalAmount;
        }
        if (null !== $this->epType) {
            $res['ep_type'] = $this->epType;
        }
        if (null !== $this->exchangeCode) {
            $res['exchange_code'] = $this->exchangeCode;
        }
        if (null !== $this->extend) {
            $res['extend'] = $this->extend;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDigitalassetExchangeEpissueRequest
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
        if (isset($map['ep_anchor'])) {
            $model->epAnchor = $map['ep_anchor'];
        }
        if (isset($map['ep_code'])) {
            $model->epCode = $map['ep_code'];
        }
        if (isset($map['ep_first_amount'])) {
            $model->epFirstAmount = $map['ep_first_amount'];
        }
        if (isset($map['ep_issue_account'])) {
            $model->epIssueAccount = $map['ep_issue_account'];
        }
        if (isset($map['ep_issue_date'])) {
            $model->epIssueDate = $map['ep_issue_date'];
        }
        if (isset($map['ep_name'])) {
            $model->epName = $map['ep_name'];
        }
        if (isset($map['ep_offline_issue_amount'])) {
            $model->epOfflineIssueAmount = $map['ep_offline_issue_amount'];
        }
        if (isset($map['ep_offline_unfreeze'])) {
            $model->epOfflineUnfreeze = $map['ep_offline_unfreeze'];
        }
        if (isset($map['ep_online_issue_amount'])) {
            $model->epOnlineIssueAmount = $map['ep_online_issue_amount'];
        }
        if (isset($map['ep_self_amount'])) {
            $model->epSelfAmount = $map['ep_self_amount'];
        }
        if (isset($map['ep_self_unfreeze'])) {
            $model->epSelfUnfreeze = $map['ep_self_unfreeze'];
        }
        if (isset($map['ep_total_amount'])) {
            $model->epTotalAmount = $map['ep_total_amount'];
        }
        if (isset($map['ep_type'])) {
            $model->epType = $map['ep_type'];
        }
        if (isset($map['exchange_code'])) {
            $model->exchangeCode = $map['exchange_code'];
        }
        if (isset($map['extend'])) {
            $model->extend = $map['extend'];
        }

        return $model;
    }
}
