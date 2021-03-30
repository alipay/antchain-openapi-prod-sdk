<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyInsurancepolicyZhonghuacaixianResponse extends Model
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

    // 保单号
    /**
     * @var string
     */
    public $polNo;

    // 电子保单下载地址
    /**
     * @var string
     */
    public $polUrl;

    // 含税保费
    /**
     * @var string
     */
    public $preMium;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'polNo'      => 'pol_no',
        'polUrl'     => 'pol_url',
        'preMium'    => 'pre_mium',
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
        if (null !== $this->polNo) {
            $res['pol_no'] = $this->polNo;
        }
        if (null !== $this->polUrl) {
            $res['pol_url'] = $this->polUrl;
        }
        if (null !== $this->preMium) {
            $res['pre_mium'] = $this->preMium;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInsurancepolicyZhonghuacaixianResponse
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
        if (isset($map['pol_no'])) {
            $model->polNo = $map['pol_no'];
        }
        if (isset($map['pol_url'])) {
            $model->polUrl = $map['pol_url'];
        }
        if (isset($map['pre_mium'])) {
            $model->preMium = $map['pre_mium'];
        }

        return $model;
    }
}
