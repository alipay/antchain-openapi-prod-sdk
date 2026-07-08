<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class CertProductInfoDO extends Model
{
    // 同证书信息显示
    /**
     * @example 证书编号
     *
     * @var string
     */
    public $certificationNo;

    // 同证书信息显示
    /**
     * @example 证书类型
     *
     * @var string
     */
    public $certificationType;

    // 同证书信息显示
    /**
     * @example 证书名称
     *
     * @var string
     */
    public $certificationName;

    // 同证书信息显示
    /**
     * @example 认证机构名称
     *
     * @var string
     */
    public $authenticationName;

    // 证书颁发时间
    /**
     * @example 2022-01-01
     *
     * @var string
     */
    public $issueTime;

    // 证书到期时间
    /**
     * @example 2020-01-01
     *
     * @var string
     */
    public $invalidTime;

    // 同证书信息显示
    /**
     * @example 认证委托人
     *
     * @var string
     */
    public $certificationAgent;

    // 同证书信息显示
    /**
     * @example 制造商
     *
     * @var string
     */
    public $manufacturer;

    // 同证书信息显示
    /**
     * @example 生产厂商
     *
     * @var string
     */
    public $cproductFirm;

    // 同证书信息显示
    /**
     * @example 认证等级
     *
     * @var string
     */
    public $certificationLevel;

    // 同证书信息显示
    /**
     * @example 产品名称
     *
     * @var string
     */
    public $cproductName;

    // 同证书信息显示
    /**
     * @example 产品型号
     *
     * @var string
     */
    public $cproductModel;

    // 证书文件地址
    /**
     * @example https://
     *
     * @var string
     */
    public $certificationFileAddress;

    // 证书授权的三方平台产品列表
    /**
     * @example
     *
     * @var CertProductAuthDO[]
     */
    public $authProducts;
    protected $_name = [
        'certificationNo'          => 'certification_no',
        'certificationType'        => 'certification_type',
        'certificationName'        => 'certification_name',
        'authenticationName'       => 'authentication_name',
        'issueTime'                => 'issue_time',
        'invalidTime'              => 'invalid_time',
        'certificationAgent'       => 'certification_agent',
        'manufacturer'             => 'manufacturer',
        'cproductFirm'             => 'cproduct_firm',
        'certificationLevel'       => 'certification_level',
        'cproductName'             => 'cproduct_name',
        'cproductModel'            => 'cproduct_model',
        'certificationFileAddress' => 'certification_file_address',
        'authProducts'             => 'auth_products',
    ];

    public function validate()
    {
        Model::validateRequired('certificationNo', $this->certificationNo, true);
        Model::validateRequired('certificationType', $this->certificationType, true);
        Model::validateRequired('certificationName', $this->certificationName, true);
        Model::validateRequired('authenticationName', $this->authenticationName, true);
        Model::validateRequired('issueTime', $this->issueTime, true);
        Model::validateRequired('invalidTime', $this->invalidTime, true);
        Model::validateRequired('certificationAgent', $this->certificationAgent, true);
        Model::validateRequired('certificationFileAddress', $this->certificationFileAddress, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certificationNo) {
            $res['certification_no'] = $this->certificationNo;
        }
        if (null !== $this->certificationType) {
            $res['certification_type'] = $this->certificationType;
        }
        if (null !== $this->certificationName) {
            $res['certification_name'] = $this->certificationName;
        }
        if (null !== $this->authenticationName) {
            $res['authentication_name'] = $this->authenticationName;
        }
        if (null !== $this->issueTime) {
            $res['issue_time'] = $this->issueTime;
        }
        if (null !== $this->invalidTime) {
            $res['invalid_time'] = $this->invalidTime;
        }
        if (null !== $this->certificationAgent) {
            $res['certification_agent'] = $this->certificationAgent;
        }
        if (null !== $this->manufacturer) {
            $res['manufacturer'] = $this->manufacturer;
        }
        if (null !== $this->cproductFirm) {
            $res['cproduct_firm'] = $this->cproductFirm;
        }
        if (null !== $this->certificationLevel) {
            $res['certification_level'] = $this->certificationLevel;
        }
        if (null !== $this->cproductName) {
            $res['cproduct_name'] = $this->cproductName;
        }
        if (null !== $this->cproductModel) {
            $res['cproduct_model'] = $this->cproductModel;
        }
        if (null !== $this->certificationFileAddress) {
            $res['certification_file_address'] = $this->certificationFileAddress;
        }
        if (null !== $this->authProducts) {
            $res['auth_products'] = [];
            if (null !== $this->authProducts && \is_array($this->authProducts)) {
                $n = 0;
                foreach ($this->authProducts as $item) {
                    $res['auth_products'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertProductInfoDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['certification_no'])) {
            $model->certificationNo = $map['certification_no'];
        }
        if (isset($map['certification_type'])) {
            $model->certificationType = $map['certification_type'];
        }
        if (isset($map['certification_name'])) {
            $model->certificationName = $map['certification_name'];
        }
        if (isset($map['authentication_name'])) {
            $model->authenticationName = $map['authentication_name'];
        }
        if (isset($map['issue_time'])) {
            $model->issueTime = $map['issue_time'];
        }
        if (isset($map['invalid_time'])) {
            $model->invalidTime = $map['invalid_time'];
        }
        if (isset($map['certification_agent'])) {
            $model->certificationAgent = $map['certification_agent'];
        }
        if (isset($map['manufacturer'])) {
            $model->manufacturer = $map['manufacturer'];
        }
        if (isset($map['cproduct_firm'])) {
            $model->cproductFirm = $map['cproduct_firm'];
        }
        if (isset($map['certification_level'])) {
            $model->certificationLevel = $map['certification_level'];
        }
        if (isset($map['cproduct_name'])) {
            $model->cproductName = $map['cproduct_name'];
        }
        if (isset($map['cproduct_model'])) {
            $model->cproductModel = $map['cproduct_model'];
        }
        if (isset($map['certification_file_address'])) {
            $model->certificationFileAddress = $map['certification_file_address'];
        }
        if (isset($map['auth_products'])) {
            if (!empty($map['auth_products'])) {
                $model->authProducts = [];
                $n                   = 0;
                foreach ($map['auth_products'] as $item) {
                    $model->authProducts[$n++] = null !== $item ? CertProductAuthDO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
