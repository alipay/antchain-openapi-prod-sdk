<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class GetHealthinfoRequest extends Model
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

    // 设备SN
    //
    /**
     * @var string
     */
    public $serialNo;

    // 设备厂商
    //
    /**
     * @var string
     */
    public $corpName;

    // 健康身份二维码
    /**
     * @var string
     */
    public $qrCode;

    // 防疫信息类型,枚举值如下： 健康信息 health , 疫苗信息 vaccination , 核酸信息 nucleicAcid , 行程信息 travel , 抗原信息 antigen , 场景信息 scene . 需要有多项信息类型时，用"|"分隔开。eg: "health|nucleicAcid"
    /**
     * @var string
     */
    public $healthTypes;

    // 通行记录ID
    //
    /**
     * @var string
     */
    public $passId;

    // 获取健康信息所需扩展参数列表：体温（temperature：36.5）
    /**
     * @var QueryHealthInfoExtendedArg[]
     */
    public $extensionInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'serialNo'          => 'serial_no',
        'corpName'          => 'corp_name',
        'qrCode'            => 'qr_code',
        'healthTypes'       => 'health_types',
        'passId'            => 'pass_id',
        'extensionInfo'     => 'extension_info',
    ];

    public function validate()
    {
        Model::validateRequired('serialNo', $this->serialNo, true);
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('qrCode', $this->qrCode, true);
        Model::validateRequired('healthTypes', $this->healthTypes, true);
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
        if (null !== $this->serialNo) {
            $res['serial_no'] = $this->serialNo;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->qrCode) {
            $res['qr_code'] = $this->qrCode;
        }
        if (null !== $this->healthTypes) {
            $res['health_types'] = $this->healthTypes;
        }
        if (null !== $this->passId) {
            $res['pass_id'] = $this->passId;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = [];
            if (null !== $this->extensionInfo && \is_array($this->extensionInfo)) {
                $n = 0;
                foreach ($this->extensionInfo as $item) {
                    $res['extension_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetHealthinfoRequest
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
        if (isset($map['serial_no'])) {
            $model->serialNo = $map['serial_no'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['qr_code'])) {
            $model->qrCode = $map['qr_code'];
        }
        if (isset($map['health_types'])) {
            $model->healthTypes = $map['health_types'];
        }
        if (isset($map['pass_id'])) {
            $model->passId = $map['pass_id'];
        }
        if (isset($map['extension_info'])) {
            if (!empty($map['extension_info'])) {
                $model->extensionInfo = [];
                $n                    = 0;
                foreach ($map['extension_info'] as $item) {
                    $model->extensionInfo[$n++] = null !== $item ? QueryHealthInfoExtendedArg::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
