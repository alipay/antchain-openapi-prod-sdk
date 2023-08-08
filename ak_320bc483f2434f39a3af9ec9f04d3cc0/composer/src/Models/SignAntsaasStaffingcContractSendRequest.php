<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class SignAntsaasStaffingcContractSendRequest extends Model
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

    // 需要确保唯一（定位订单）
    /**
     * @var string
     */
    public $outBizNo;

    // 合同或模版文件
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

    // 合同类型（1合同文件 2合同模板）
    /**
     * @var int
     */
    public $contractType;

    // 合同名称, 必须带上文件名后缀。 .dpf .doc .docx
    /**
     * @var string
     */
    public $contractName;

    // 合同文件类型 （pdf、word）
    /**
     * @var string
     */
    public $contractFileType;

    // 合同模版参数，json格式，以key value格式存储，合同类型属于模板必填
    /**
     * @var string
     */
    public $simpleFormFields;

    // 签署平台（ALIPAY或H5）
    /**
     * @var string
     */
    public $signPlatform;

    // 合同用户信息列表
    /**
     * @var SignUserInfo[]
     */
    public $signUserList;

    // 合同企业信息列表
    /**
     * @var SignEnterpriseInfo[]
     */
    public $signEnterpriseList;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'outBizNo'           => 'out_biz_no',
        'fileId'             => 'file_id',
        'contractType'       => 'contract_type',
        'contractName'       => 'contract_name',
        'contractFileType'   => 'contract_file_type',
        'simpleFormFields'   => 'simple_form_fields',
        'signPlatform'       => 'sign_platform',
        'signUserList'       => 'sign_user_list',
        'signEnterpriseList' => 'sign_enterprise_list',
    ];

    public function validate()
    {
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('contractType', $this->contractType, true);
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('contractFileType', $this->contractFileType, true);
        Model::validateRequired('signPlatform', $this->signPlatform, true);
        Model::validateRequired('signUserList', $this->signUserList, true);
        Model::validateRequired('signEnterpriseList', $this->signEnterpriseList, true);
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
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
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
        if (null !== $this->contractType) {
            $res['contract_type'] = $this->contractType;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->contractFileType) {
            $res['contract_file_type'] = $this->contractFileType;
        }
        if (null !== $this->simpleFormFields) {
            $res['simple_form_fields'] = $this->simpleFormFields;
        }
        if (null !== $this->signPlatform) {
            $res['sign_platform'] = $this->signPlatform;
        }
        if (null !== $this->signUserList) {
            $res['sign_user_list'] = [];
            if (null !== $this->signUserList && \is_array($this->signUserList)) {
                $n = 0;
                foreach ($this->signUserList as $item) {
                    $res['sign_user_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->signEnterpriseList) {
            $res['sign_enterprise_list'] = [];
            if (null !== $this->signEnterpriseList && \is_array($this->signEnterpriseList)) {
                $n = 0;
                foreach ($this->signEnterpriseList as $item) {
                    $res['sign_enterprise_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignAntsaasStaffingcContractSendRequest
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
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
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
        if (isset($map['contract_type'])) {
            $model->contractType = $map['contract_type'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['contract_file_type'])) {
            $model->contractFileType = $map['contract_file_type'];
        }
        if (isset($map['simple_form_fields'])) {
            $model->simpleFormFields = $map['simple_form_fields'];
        }
        if (isset($map['sign_platform'])) {
            $model->signPlatform = $map['sign_platform'];
        }
        if (isset($map['sign_user_list'])) {
            if (!empty($map['sign_user_list'])) {
                $model->signUserList = [];
                $n                   = 0;
                foreach ($map['sign_user_list'] as $item) {
                    $model->signUserList[$n++] = null !== $item ? SignUserInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sign_enterprise_list'])) {
            if (!empty($map['sign_enterprise_list'])) {
                $model->signEnterpriseList = [];
                $n                         = 0;
                foreach ($map['sign_enterprise_list'] as $item) {
                    $model->signEnterpriseList[$n++] = null !== $item ? SignEnterpriseInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
