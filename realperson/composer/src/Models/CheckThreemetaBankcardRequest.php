<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class CheckThreemetaBankcardRequest extends Model
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

    // 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
    /**
     * @var string
     */
    public $outerOrderNo;

    // 要素入参模式： 1：银行卡号+姓名+证件号 2：银行卡号+姓名+手机号 3：银行卡号+证件号+手机号，默认为1
    /**
     * @var string
     */
    public $metaMode;

    // 银行卡号
    /**
     * @var string
     */
    public $bankCard;

    // 姓名
    /**
     * @var string
     */
    public $certName;

    // 身份证号
    /**
     * @var string
     */
    public $certNo;

    // 证件类型： 1：居民身份证（默认值） 2：军官证 3：护照 4：回乡证 5：台胞证 6：警官证 7：士兵证 99：其他
    /**
     * @var string
     */
    public $certType;

    // 手机号码
    /**
     * @var string
     */
    public $mobile;

    // 扩展信息，Map的json格式
    /**
     * @var string
     */
    public $externParam;

    // 入参加密模式：NONE：不加密；AES：姓名、身份证号、手机号码字段都是AES加密后的字符串。非必填，不填时默认明文
    /**
     * @var string
     */
    public $reqEncType;

    // 用于入参加密的AES密钥
    /**
     * @var string
     */
    public $encToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'metaMode'          => 'meta_mode',
        'bankCard'          => 'bank_card',
        'certName'          => 'cert_name',
        'certNo'            => 'cert_no',
        'certType'          => 'cert_type',
        'mobile'            => 'mobile',
        'externParam'       => 'extern_param',
        'reqEncType'        => 'req_enc_type',
        'encToken'          => 'enc_token',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('bankCard', $this->bankCard, true);
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
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->metaMode) {
            $res['meta_mode'] = $this->metaMode;
        }
        if (null !== $this->bankCard) {
            $res['bank_card'] = $this->bankCard;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        if (null !== $this->reqEncType) {
            $res['req_enc_type'] = $this->reqEncType;
        }
        if (null !== $this->encToken) {
            $res['enc_token'] = $this->encToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckThreemetaBankcardRequest
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
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['meta_mode'])) {
            $model->metaMode = $map['meta_mode'];
        }
        if (isset($map['bank_card'])) {
            $model->bankCard = $map['bank_card'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }
        if (isset($map['req_enc_type'])) {
            $model->reqEncType = $map['req_enc_type'];
        }
        if (isset($map['enc_token'])) {
            $model->encToken = $map['enc_token'];
        }

        return $model;
    }
}
