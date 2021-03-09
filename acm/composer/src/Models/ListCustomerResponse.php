<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class ListCustomerResponse extends Model
{
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

    // 企业列表
    /**
     * @var Customer[]
     */
    public $customers;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'customers'  => 'customers',
    ];

    public function validate()
    {
        Model::validateRequired('customers', $this->customers, true);
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
        if (null !== $this->customers) {
            $res['customers'] = [];
            if (null !== $this->customers && \is_array($this->customers)) {
                $n = 0;
                foreach ($this->customers as $item) {
                    $res['customers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListCustomerResponse
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
        if (isset($map['customers'])) {
            if (!empty($map['customers'])) {
                $model->customers = [];
                $n                = 0;
                foreach ($map['customers'] as $item) {
                    $model->customers[$n++] = null !== $item ? Customer::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
