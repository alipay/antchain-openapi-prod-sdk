<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeRouterFundrouterResponse extends Model
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

    // 资金方代码
    /**
     * @var string
     */
    public $fundCode;

    // 资金方简称
    /**
     * @var string
     */
    public $abbreFundName;

    // 客户编号
    /**
     * @var string
     */
    public $customerNo;

    // 资金方列表
    /**
     * @var GwFundRouterResult[]
     */
    public $fundList;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'fundCode'      => 'fund_code',
        'abbreFundName' => 'abbre_fund_name',
        'customerNo'    => 'customer_no',
        'fundList'      => 'fund_list',
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
        if (null !== $this->fundCode) {
            $res['fund_code'] = $this->fundCode;
        }
        if (null !== $this->abbreFundName) {
            $res['abbre_fund_name'] = $this->abbreFundName;
        }
        if (null !== $this->customerNo) {
            $res['customer_no'] = $this->customerNo;
        }
        if (null !== $this->fundList) {
            $res['fund_list'] = [];
            if (null !== $this->fundList && \is_array($this->fundList)) {
                $n = 0;
                foreach ($this->fundList as $item) {
                    $res['fund_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeRouterFundrouterResponse
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
        if (isset($map['fund_code'])) {
            $model->fundCode = $map['fund_code'];
        }
        if (isset($map['abbre_fund_name'])) {
            $model->abbreFundName = $map['abbre_fund_name'];
        }
        if (isset($map['customer_no'])) {
            $model->customerNo = $map['customer_no'];
        }
        if (isset($map['fund_list'])) {
            if (!empty($map['fund_list'])) {
                $model->fundList = [];
                $n               = 0;
                foreach ($map['fund_list'] as $item) {
                    $model->fundList[$n++] = null !== $item ? GwFundRouterResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
