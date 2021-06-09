<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateStandardVoucherResponse extends Model
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

    // 凭证返回值_voucherResp
    /**
     * @var VoucherResp
     */
    public $voucherResp;

    // 编码
    /**
     * @var string
     */
    public $code;

    // 凭证返回值_voucherRespList
    /**
     * @var VoucherResp[]
     */
    public $voucherRespList;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'voucherResp'     => 'voucher_resp',
        'code'            => 'code',
        'voucherRespList' => 'voucher_resp_list',
    ];

    public function validate()
    {
        Model::validateRequired('voucherResp', $this->voucherResp, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('voucherRespList', $this->voucherRespList, true);
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
        if (null !== $this->voucherResp) {
            $res['voucher_resp'] = null !== $this->voucherResp ? $this->voucherResp->toMap() : null;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->voucherRespList) {
            $res['voucher_resp_list'] = [];
            if (null !== $this->voucherRespList && \is_array($this->voucherRespList)) {
                $n = 0;
                foreach ($this->voucherRespList as $item) {
                    $res['voucher_resp_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateStandardVoucherResponse
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
        if (isset($map['voucher_resp'])) {
            $model->voucherResp = VoucherResp::fromMap($map['voucher_resp']);
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['voucher_resp_list'])) {
            if (!empty($map['voucher_resp_list'])) {
                $model->voucherRespList = [];
                $n                      = 0;
                foreach ($map['voucher_resp_list'] as $item) {
                    $model->voucherRespList[$n++] = null !== $item ? VoucherResp::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
