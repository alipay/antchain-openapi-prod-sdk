<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models;

use AlibabaCloud\Tea\Model;

class AccountQueryResult extends Model
{
    // 外部业务平台会员ID
    /**
     * @example 8899900004655511
     *
     * @var string
     */
    public $outMemberId;

    // 账号列表
    /**
     * @example [{"account_no":"755936042810703","account_name":"测试账户","offical_name":"中国工商银行股份有限公司北京德外支行","offical_number":"102100000136","status":"INIT","category":"[“SELLER”,"BUYER"]","last_pay_fail":"true"}]
     *
     * @var AccountVO[]
     */
    public $accounts;

    // 业务错误码(为空表示成功，否则为业务错误码)
    /**
     * @example PARAM_MISSING
     *
     * @var string
     */
    public $subCode;

    // 业务错误描述
    /**
     * @example 参数不全
     *
     * @var string
     */
    public $subMsg;
    protected $_name = [
        'outMemberId' => 'out_member_id',
        'accounts'    => 'accounts',
        'subCode'     => 'sub_code',
        'subMsg'      => 'sub_msg',
    ];

    public function validate()
    {
        Model::validateRequired('outMemberId', $this->outMemberId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->outMemberId) {
            $res['out_member_id'] = $this->outMemberId;
        }
        if (null !== $this->accounts) {
            $res['accounts'] = [];
            if (null !== $this->accounts && \is_array($this->accounts)) {
                $n = 0;
                foreach ($this->accounts as $item) {
                    $res['accounts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->subCode) {
            $res['sub_code'] = $this->subCode;
        }
        if (null !== $this->subMsg) {
            $res['sub_msg'] = $this->subMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccountQueryResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['out_member_id'])) {
            $model->outMemberId = $map['out_member_id'];
        }
        if (isset($map['accounts'])) {
            if (!empty($map['accounts'])) {
                $model->accounts = [];
                $n               = 0;
                foreach ($map['accounts'] as $item) {
                    $model->accounts[$n++] = null !== $item ? AccountVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sub_code'])) {
            $model->subCode = $map['sub_code'];
        }
        if (isset($map['sub_msg'])) {
            $model->subMsg = $map['sub_msg'];
        }

        return $model;
    }
}
