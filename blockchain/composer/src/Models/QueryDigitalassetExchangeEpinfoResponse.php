<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalassetExchangeEpinfoResponse extends Model
{
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

    // 版通发行日时间戳
    /**
     * @var int
     */
    public $epIssueDate;

    // 版通历史发行记录
    /**
     * @var EPIssueHisInfo[]
     */
    public $epIssueHistory;

    // 版通名称
    /**
     * @var string
     */
    public $epName;

    // 版通线下发行量
    /**
     * @var int
     */
    public $epOfflineIssueAmount;

    // 版通线下日解限量
    /**
     * @var int
     */
    public $epOfflineUnfreeze;

    // 版通线上发行量
    /**
     * @var int
     */
    public $epOnlineIssueAmount;

    // 版通发行方自持量
    /**
     * @var int
     */
    public $epSelfAmount;

    // 版通自持日解限量
    /**
     * @var int
     */
    public $epSelfUnfreeze;

    // 版通状态 0:正常 1:锁定
    /**
     * @var int
     */
    public $epStatus;

    // 版通总发行量
    /**
     * @var int
     */
    public $epTotalAmount;

    // 版通类型
    /**
     * @var string
     */
    public $epType;

    // 扩展字段
    /**
     * @var string
     */
    public $extend;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'epAnchor'             => 'ep_anchor',
        'epCode'               => 'ep_code',
        'epFirstAmount'        => 'ep_first_amount',
        'epIssueAccount'       => 'ep_issue_account',
        'epIssueDate'          => 'ep_issue_date',
        'epIssueHistory'       => 'ep_issue_history',
        'epName'               => 'ep_name',
        'epOfflineIssueAmount' => 'ep_offline_issue_amount',
        'epOfflineUnfreeze'    => 'ep_offline_unfreeze',
        'epOnlineIssueAmount'  => 'ep_online_issue_amount',
        'epSelfAmount'         => 'ep_self_amount',
        'epSelfUnfreeze'       => 'ep_self_unfreeze',
        'epStatus'             => 'ep_status',
        'epTotalAmount'        => 'ep_total_amount',
        'epType'               => 'ep_type',
        'extend'               => 'extend',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
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
        if (null !== $this->epIssueHistory) {
            $res['ep_issue_history'] = [];
            if (null !== $this->epIssueHistory && \is_array($this->epIssueHistory)) {
                $n = 0;
                foreach ($this->epIssueHistory as $item) {
                    $res['ep_issue_history'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->epStatus) {
            $res['ep_status'] = $this->epStatus;
        }
        if (null !== $this->epTotalAmount) {
            $res['ep_total_amount'] = $this->epTotalAmount;
        }
        if (null !== $this->epType) {
            $res['ep_type'] = $this->epType;
        }
        if (null !== $this->extend) {
            $res['extend'] = $this->extend;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDigitalassetExchangeEpinfoResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
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
        if (isset($map['ep_issue_history'])) {
            if (!empty($map['ep_issue_history'])) {
                $model->epIssueHistory = [];
                $n                     = 0;
                foreach ($map['ep_issue_history'] as $item) {
                    $model->epIssueHistory[$n++] = null !== $item ? EPIssueHisInfo::fromMap($item) : $item;
                }
            }
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
        if (isset($map['ep_status'])) {
            $model->epStatus = $map['ep_status'];
        }
        if (isset($map['ep_total_amount'])) {
            $model->epTotalAmount = $map['ep_total_amount'];
        }
        if (isset($map['ep_type'])) {
            $model->epType = $map['ep_type'];
        }
        if (isset($map['extend'])) {
            $model->extend = $map['extend'];
        }

        return $model;
    }
}
