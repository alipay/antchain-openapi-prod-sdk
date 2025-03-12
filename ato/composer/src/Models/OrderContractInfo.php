<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OrderContractInfo extends Model
{
    // 电子合同签署单号
    /**
     * @example 20240505151148001384
     *
     * @var string
     */
    public $signNo;

    // 签署时间
    /**
     * @example 2023-11-12 00:00:00
     *
     * @var string
     */
    public $signTime;

    // 合同签署类型
    /**
     * @example lease
     *
     * @var string
     */
    public $contractType;

    // 文件合同类型
    /**
     * @example lease
     *
     * @var string
     */
    public $agreementType;

    // 模板ID
    /**
     * @example T20240505151148001384
     *
     * @var string
     */
    public $templateId;

    // 模板文件名称
    /**
     * @example 租赁合同
     *
     * @var string
     */
    public $fileName;

    // 合同文件下载地址
    /**
     * @example oss
     *
     * @var string
     */
    public $downloadUrl;
    protected $_name = [
        'signNo'        => 'sign_no',
        'signTime'      => 'sign_time',
        'contractType'  => 'contract_type',
        'agreementType' => 'agreement_type',
        'templateId'    => 'template_id',
        'fileName'      => 'file_name',
        'downloadUrl'   => 'download_url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->signNo) {
            $res['sign_no'] = $this->signNo;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }
        if (null !== $this->contractType) {
            $res['contract_type'] = $this->contractType;
        }
        if (null !== $this->agreementType) {
            $res['agreement_type'] = $this->agreementType;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->downloadUrl) {
            $res['download_url'] = $this->downloadUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderContractInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sign_no'])) {
            $model->signNo = $map['sign_no'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }
        if (isset($map['contract_type'])) {
            $model->contractType = $map['contract_type'];
        }
        if (isset($map['agreement_type'])) {
            $model->agreementType = $map['agreement_type'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['download_url'])) {
            $model->downloadUrl = $map['download_url'];
        }

        return $model;
    }
}
