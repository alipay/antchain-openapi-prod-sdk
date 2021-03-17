<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class CreateRealtytradePersonalsealRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 个人在数字房产平台的唯一ID
    /**
     * @var string
     */
    public $personalId;

    // 图片data，BASE64 编码后图片信息，图片原始格式必须为 png
    /**
     * @var string
     */
    public $pictureData;

    // 印章高度，单位为px，默认95
    /**
     * @var int
     */
    public $sealHeight;

    // 印章宽度，单位为px，默认95
    /**
     * @var int
     */
    public $sealWidth;

    // 否对图片进行透明化处理，默认false。仅对图片整体做透明化处理，无法去除图片背景。
    /**
     * @var bool
     */
    public $transparentizing;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'personalId'        => 'personal_id',
        'pictureData'       => 'picture_data',
        'sealHeight'        => 'seal_height',
        'sealWidth'         => 'seal_width',
        'transparentizing'  => 'transparentizing',
    ];

    public function validate()
    {
        Model::validateRequired('personalId', $this->personalId, true);
        Model::validateRequired('pictureData', $this->pictureData, true);
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
        if (null !== $this->personalId) {
            $res['personal_id'] = $this->personalId;
        }
        if (null !== $this->pictureData) {
            $res['picture_data'] = $this->pictureData;
        }
        if (null !== $this->sealHeight) {
            $res['seal_height'] = $this->sealHeight;
        }
        if (null !== $this->sealWidth) {
            $res['seal_width'] = $this->sealWidth;
        }
        if (null !== $this->transparentizing) {
            $res['transparentizing'] = $this->transparentizing;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateRealtytradePersonalsealRequest
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
        if (isset($map['personal_id'])) {
            $model->personalId = $map['personal_id'];
        }
        if (isset($map['picture_data'])) {
            $model->pictureData = $map['picture_data'];
        }
        if (isset($map['seal_height'])) {
            $model->sealHeight = $map['seal_height'];
        }
        if (isset($map['seal_width'])) {
            $model->sealWidth = $map['seal_width'];
        }
        if (isset($map['transparentizing'])) {
            $model->transparentizing = $map['transparentizing'];
        }

        return $model;
    }
}
