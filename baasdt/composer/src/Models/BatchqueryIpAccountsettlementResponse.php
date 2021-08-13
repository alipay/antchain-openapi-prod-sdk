<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryIpAccountsettlementResponse extends Model
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

    // 渠道对应的版权方信息
    /**
     * @var AccountSettlementInfo[]
     */
    public $accountInfo;

    // 结果总数，不是列表值，用于分页
    /**
     * @var int
     */
    public $allCount;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'accountInfo' => 'account_info',
        'allCount'    => 'all_count',
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
        if (null !== $this->accountInfo) {
            $res['account_info'] = [];
            if (null !== $this->accountInfo && \is_array($this->accountInfo)) {
                $n = 0;
                foreach ($this->accountInfo as $item) {
                    $res['account_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->allCount) {
            $res['all_count'] = $this->allCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryIpAccountsettlementResponse
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
        if (isset($map['account_info'])) {
            if (!empty($map['account_info'])) {
                $model->accountInfo = [];
                $n                  = 0;
                foreach ($map['account_info'] as $item) {
                    $model->accountInfo[$n++] = null !== $item ? AccountSettlementInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['all_count'])) {
            $model->allCount = $map['all_count'];
        }

        return $model;
    }
}
