<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class QueryPdataUnderwriteResponse extends Model
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

    // 姓名（md5）
    /**
     * @var string
     */
    public $name;

    // 身份证(md5)
    /**
     * @var string
     */
    public $cardNo;

    // 成功的请求省份行政区划代码
    /**
     * @var string[]
     */
    public $successRecommandProvinceList;

    // 失败的请求省份行政区划代码
    /**
     * @var string[]
     */
    public $failRecommandProvinceList;

    // 加密后的出参数据
    /**
     * @var string
     */
    public $encryptData;
    protected $_name = [
        'reqMsgId'                     => 'req_msg_id',
        'resultCode'                   => 'result_code',
        'resultMsg'                    => 'result_msg',
        'name'                         => 'name',
        'cardNo'                       => 'card_no',
        'successRecommandProvinceList' => 'success_recommand_province_list',
        'failRecommandProvinceList'    => 'fail_recommand_province_list',
        'encryptData'                  => 'encrypt_data',
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->cardNo) {
            $res['card_no'] = $this->cardNo;
        }
        if (null !== $this->successRecommandProvinceList) {
            $res['success_recommand_province_list'] = $this->successRecommandProvinceList;
        }
        if (null !== $this->failRecommandProvinceList) {
            $res['fail_recommand_province_list'] = $this->failRecommandProvinceList;
        }
        if (null !== $this->encryptData) {
            $res['encrypt_data'] = $this->encryptData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPdataUnderwriteResponse
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['card_no'])) {
            $model->cardNo = $map['card_no'];
        }
        if (isset($map['success_recommand_province_list'])) {
            if (!empty($map['success_recommand_province_list'])) {
                $model->successRecommandProvinceList = $map['success_recommand_province_list'];
            }
        }
        if (isset($map['fail_recommand_province_list'])) {
            if (!empty($map['fail_recommand_province_list'])) {
                $model->failRecommandProvinceList = $map['fail_recommand_province_list'];
            }
        }
        if (isset($map['encrypt_data'])) {
            $model->encryptData = $map['encrypt_data'];
        }

        return $model;
    }
}
