<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UploadTransportContractRequest extends Model
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

    // 合同甲方did，一般为合同甲方的链上数字身份
    /**
     * @var string
     */
    public $partyADid;

    // 运输合同生效日期，格式要求yyyy-MM-dd
    /**
     * @var string
     */
    public $contractEffectiveDate;

    // 运输合同到期日期，要求格式yyyy-MM-dd
    /**
     * @var string
     */
    public $contractExpiresDate;

    // 影像件文件信息列表，可以包含多个文件，每个文件需要有文件id和文件hash  (请求蚂蚁影像上传接口获取的文件id和文件hash)。影像文件格式要求：bmp,jpg,jpeg,gif,psd,png,tiff,tga,eps,pdf
    /**
     * @var UploadFileInfo[]
     */
    public $fileInfos;

    // 合同乙方Did，一般为合同乙方的链上数字身份
    /**
     * @var string
     */
    public $partyBDid;

    // 运输合同编号
    /**
     * @var string
     */
    public $transportContractCode;

    // 所属平台did
    /**
     * @var string
     */
    public $platformDid;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'partyADid'             => 'party_a_did',
        'contractEffectiveDate' => 'contract_effective_date',
        'contractExpiresDate'   => 'contract_expires_date',
        'fileInfos'             => 'file_infos',
        'partyBDid'             => 'party_b_did',
        'transportContractCode' => 'transport_contract_code',
        'platformDid'           => 'platform_did',
    ];

    public function validate()
    {
        Model::validateRequired('partyADid', $this->partyADid, true);
        Model::validateRequired('contractEffectiveDate', $this->contractEffectiveDate, true);
        Model::validateRequired('contractExpiresDate', $this->contractExpiresDate, true);
        Model::validateRequired('fileInfos', $this->fileInfos, true);
        Model::validateRequired('partyBDid', $this->partyBDid, true);
        Model::validateRequired('transportContractCode', $this->transportContractCode, true);
        Model::validateRequired('platformDid', $this->platformDid, true);
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
        if (null !== $this->partyADid) {
            $res['party_a_did'] = $this->partyADid;
        }
        if (null !== $this->contractEffectiveDate) {
            $res['contract_effective_date'] = $this->contractEffectiveDate;
        }
        if (null !== $this->contractExpiresDate) {
            $res['contract_expires_date'] = $this->contractExpiresDate;
        }
        if (null !== $this->fileInfos) {
            $res['file_infos'] = [];
            if (null !== $this->fileInfos && \is_array($this->fileInfos)) {
                $n = 0;
                foreach ($this->fileInfos as $item) {
                    $res['file_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->partyBDid) {
            $res['party_b_did'] = $this->partyBDid;
        }
        if (null !== $this->transportContractCode) {
            $res['transport_contract_code'] = $this->transportContractCode;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadTransportContractRequest
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
        if (isset($map['party_a_did'])) {
            $model->partyADid = $map['party_a_did'];
        }
        if (isset($map['contract_effective_date'])) {
            $model->contractEffectiveDate = $map['contract_effective_date'];
        }
        if (isset($map['contract_expires_date'])) {
            $model->contractExpiresDate = $map['contract_expires_date'];
        }
        if (isset($map['file_infos'])) {
            if (!empty($map['file_infos'])) {
                $model->fileInfos = [];
                $n                = 0;
                foreach ($map['file_infos'] as $item) {
                    $model->fileInfos[$n++] = null !== $item ? UploadFileInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['party_b_did'])) {
            $model->partyBDid = $map['party_b_did'];
        }
        if (isset($map['transport_contract_code'])) {
            $model->transportContractCode = $map['transport_contract_code'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }

        return $model;
    }
}
