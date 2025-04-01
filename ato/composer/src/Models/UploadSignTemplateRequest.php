<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class UploadSignTemplateRequest extends Model
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

    // 订单所属商户的统一社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 合同类型
    /**
     * @var string
     */
    public $contractType;

    // 模板类型
    /**
     * @var string
     */
    public $agreementType;

    // 签署区坐标配置
    /**
     * @var string
     */
    public $posConf;

    // 模板参数
    /**
     * @var string
     */
    public $templateArgs;

    // 上传的pdf文件，需要以.pdf后缀结尾
    /**
     * @description 待上传文件
     *
     * @var Stream
     */
    public $fileObject;

    /**
     * @description 待上传文件名
     *
     * @var string
     */
    public $fileObjectName;

    /**
     * @var string
     */
    public $fileId;

    // 资方统一社会信用代码，默认为空
    /**
     * @var string
     */
    public $fundId;

    // 是否需要资方签署，默认为否
    /**
     * @var bool
     */
    public $fundSign;

    // 资方签署区坐标，默认为空
    /**
     * @var string
     */
    public $fundPosConf;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'merchantId'        => 'merchant_id',
        'contractType'      => 'contract_type',
        'agreementType'     => 'agreement_type',
        'posConf'           => 'pos_conf',
        'templateArgs'      => 'template_args',
        'fileId'            => 'file_id',
        'fundId'            => 'fund_id',
        'fundSign'          => 'fund_sign',
        'fundPosConf'       => 'fund_pos_conf',
    ];

    public function validate()
    {
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('posConf', $this->posConf, true);
        Model::validateRequired('fileId', $this->fileId, true);
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->contractType) {
            $res['contract_type'] = $this->contractType;
        }
        if (null !== $this->agreementType) {
            $res['agreement_type'] = $this->agreementType;
        }
        if (null !== $this->posConf) {
            $res['pos_conf'] = $this->posConf;
        }
        if (null !== $this->templateArgs) {
            $res['template_args'] = $this->templateArgs;
        }
        if (null !== $this->fileObject) {
            $res['fileObject'] = $this->fileObject;
        }
        if (null !== $this->fileObjectName) {
            $res['fileObjectName'] = $this->fileObjectName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->fundSign) {
            $res['fund_sign'] = $this->fundSign;
        }
        if (null !== $this->fundPosConf) {
            $res['fund_pos_conf'] = $this->fundPosConf;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadSignTemplateRequest
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
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['contract_type'])) {
            $model->contractType = $map['contract_type'];
        }
        if (isset($map['agreement_type'])) {
            $model->agreementType = $map['agreement_type'];
        }
        if (isset($map['pos_conf'])) {
            $model->posConf = $map['pos_conf'];
        }
        if (isset($map['template_args'])) {
            $model->templateArgs = $map['template_args'];
        }
        if (isset($map['fileObject'])) {
            $model->fileObject = $map['fileObject'];
        }
        if (isset($map['fileObjectName'])) {
            $model->fileObjectName = $map['fileObjectName'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['fund_sign'])) {
            $model->fundSign = $map['fund_sign'];
        }
        if (isset($map['fund_pos_conf'])) {
            $model->fundPosConf = $map['fund_pos_conf'];
        }

        return $model;
    }
}
