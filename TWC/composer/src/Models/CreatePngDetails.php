<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreatePngDetails extends Model
{
    // 明细唯一id，必填（用于标识明细中的唯一键，返回多个图片地址时，根据id去进行匹配）
    /**
     * @example 明细唯一id，必填（用于标识明细中的唯一键，返回多个图片地址时，根据id去进行匹配）
     *
     * @var string
     */
    public $id;

    // 身份类型，必填，SignUserTypeEnum
    /**
     * @example 1、PERSON：个人 2、ORG：公司
     *
     * @var string
     */
    public $certType;

    // 名称，个人姓名/公司名称
    /**
     * @example 个人姓名/公司名称
     *
     * @var string
     */
    public $name;

    // 证件号，个人身份证/公司统一社会信用代码
    /**
     * @example 个人身份证/公司统一社会信用代码
     *
     * @var string
     */
    public $certNo;

    // 字体大小，选填，推荐不传（除特殊场景需要），默认40
    /**
     * @example 40
     *
     * @var int
     */
    public $fontSize;

    // 自定义名称，选填，不传则默认按照name参数中的值生成文件名。此参数主要用于同一个人需要生成不同样式的签名图片场景
    /**
     * @example 自定义名称
     *
     * @var string
     */
    public $customName;

    // 字体颜色，选填，推荐不传（除特殊场景需要），默认黑色
    /**
     * @example 字体颜色，选填，推荐不传（除特殊场景需要），默认黑色
     *
     * @var string
     */
    public $fontColor;

    // [是否带边框，选填，推荐不传（除特殊场景需要），默认false]": "boolean"
    /**
     * @example 是否带边框，选填，推荐不传（除特殊场景需要），默认false
     *
     * @var bool
     */
    public $withBorder;

    // [边框颜色，选填，推荐不传（除特殊场景需要），默认红色]
    /**
     * @example [边框颜色，选填，推荐不传（除特殊场景需要），默认红色]
     *
     * @var string
     */
    public $borderColor;
    protected $_name = [
        'id'          => 'id',
        'certType'    => 'cert_type',
        'name'        => 'name',
        'certNo'      => 'cert_no',
        'fontSize'    => 'font_size',
        'customName'  => 'custom_name',
        'fontColor'   => 'font_color',
        'withBorder'  => 'with_border',
        'borderColor' => 'border_color',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('certNo', $this->certNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->fontSize) {
            $res['font_size'] = $this->fontSize;
        }
        if (null !== $this->customName) {
            $res['custom_name'] = $this->customName;
        }
        if (null !== $this->fontColor) {
            $res['font_color'] = $this->fontColor;
        }
        if (null !== $this->withBorder) {
            $res['with_border'] = $this->withBorder;
        }
        if (null !== $this->borderColor) {
            $res['border_color'] = $this->borderColor;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreatePngDetails
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['font_size'])) {
            $model->fontSize = $map['font_size'];
        }
        if (isset($map['custom_name'])) {
            $model->customName = $map['custom_name'];
        }
        if (isset($map['font_color'])) {
            $model->fontColor = $map['font_color'];
        }
        if (isset($map['with_border'])) {
            $model->withBorder = $map['with_border'];
        }
        if (isset($map['border_color'])) {
            $model->borderColor = $map['border_color'];
        }

        return $model;
    }
}
