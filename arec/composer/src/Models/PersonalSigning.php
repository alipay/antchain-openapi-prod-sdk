<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class PersonalSigning extends Model
{
    // 数字房产账户 ID
    //
    /**
     * @example 1123123
     *
     * @var string
     */
    public $personalId;

    // 个人印章 ID，如不填写则使用个人默认印章，如果无默认印章则报错
    /**
     * @example 11111
     *
     * @var string
     */
    public $personalSealId;

    // 个人签署页码，本签名最终签署到协议哪一页
    /**
     * @example 3
     *
     * @var int
     */
    public $personalSignPageNo;

    // 个人签署页位置的X坐标，为距离左侧边界的位置，单位为PX
    /**
     * @example 5.5
     *
     * @var string
     */
    public $personalSignCoordinateX;

    // 个人签署页位置的Y坐标，为距离下边界的位置，单位为PX，计算方法同上。关于签署位置 XY 坐标的计算方法请参考文档：https://antchain.antgroup.com/docs/11/155164，注意XY为签署区中心的点的坐标，需要考虑前后距离防止遮挡文字。
    /**
     * @example 111.12
     *
     * @var string
     */
    public $personalSignCoordinateY;
    protected $_name = [
        'personalId'              => 'personal_id',
        'personalSealId'          => 'personal_seal_id',
        'personalSignPageNo'      => 'personal_sign_page_no',
        'personalSignCoordinateX' => 'personal_sign_coordinate_x',
        'personalSignCoordinateY' => 'personal_sign_coordinate_y',
    ];

    public function validate()
    {
        Model::validateRequired('personalId', $this->personalId, true);
        Model::validateRequired('personalSignPageNo', $this->personalSignPageNo, true);
        Model::validateRequired('personalSignCoordinateX', $this->personalSignCoordinateX, true);
        Model::validateRequired('personalSignCoordinateY', $this->personalSignCoordinateY, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->personalId) {
            $res['personal_id'] = $this->personalId;
        }
        if (null !== $this->personalSealId) {
            $res['personal_seal_id'] = $this->personalSealId;
        }
        if (null !== $this->personalSignPageNo) {
            $res['personal_sign_page_no'] = $this->personalSignPageNo;
        }
        if (null !== $this->personalSignCoordinateX) {
            $res['personal_sign_coordinate_x'] = $this->personalSignCoordinateX;
        }
        if (null !== $this->personalSignCoordinateY) {
            $res['personal_sign_coordinate_y'] = $this->personalSignCoordinateY;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PersonalSigning
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['personal_id'])) {
            $model->personalId = $map['personal_id'];
        }
        if (isset($map['personal_seal_id'])) {
            $model->personalSealId = $map['personal_seal_id'];
        }
        if (isset($map['personal_sign_page_no'])) {
            $model->personalSignPageNo = $map['personal_sign_page_no'];
        }
        if (isset($map['personal_sign_coordinate_x'])) {
            $model->personalSignCoordinateX = $map['personal_sign_coordinate_x'];
        }
        if (isset($map['personal_sign_coordinate_y'])) {
            $model->personalSignCoordinateY = $map['personal_sign_coordinate_y'];
        }

        return $model;
    }
}
