<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AICLAIM\Models;

use AlibabaCloud\Tea\Model;

class ExecImageClassificationResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 业务号，⽤于对账
    /**
     * @var string
     */
    public $batchNo;

    // 枚举类型，详见接入文档说明
    /**
     * @var string
     */
    public $imageType;

    // 图片描述
    /**
     * @var string
     */
    public $description;

    // 增强后的图片
    /**
     * @var string
     */
    public $enhanceImage;

    // 是否模糊，返回0表示清晰，返回1表示模糊
    /**
     * @var bool
     */
    public $isBlur;

    // 是否复印件，返回0表示⾮ 复印件，返回1表示复印件
    /**
     * @var bool
     */
    public $isCopyfile;

    // 是否翻拍件，返回0表示⾮ 翻拍件，返回1表示翻拍件
    /**
     * @var bool
     */
    public $isRemakefile;

    // 材料是否不完整（有遮 挡），返回0表示完整（⽆ 遮挡），返回1表示材料不完 整（有遮挡）
    /**
     * @var bool
     */
    public $isUncomplet;

    // 单张图片中是否包含2份及以上材料，0表示只有1份，1表示两份及以上
    /**
     * @var bool
     */
    public $isMultiMaterial;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'batchNo'         => 'batch_no',
        'imageType'       => 'image_type',
        'description'     => 'description',
        'enhanceImage'    => 'enhance_image',
        'isBlur'          => 'is_blur',
        'isCopyfile'      => 'is_copyfile',
        'isRemakefile'    => 'is_remakefile',
        'isUncomplet'     => 'is_uncomplet',
        'isMultiMaterial' => 'is_multi_material',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->batchNo) {
            $res['batch_no'] = $this->batchNo;
        }
        if (null !== $this->imageType) {
            $res['image_type'] = $this->imageType;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->enhanceImage) {
            $res['enhance_image'] = $this->enhanceImage;
        }
        if (null !== $this->isBlur) {
            $res['is_blur'] = $this->isBlur;
        }
        if (null !== $this->isCopyfile) {
            $res['is_copyfile'] = $this->isCopyfile;
        }
        if (null !== $this->isRemakefile) {
            $res['is_remakefile'] = $this->isRemakefile;
        }
        if (null !== $this->isUncomplet) {
            $res['is_uncomplet'] = $this->isUncomplet;
        }
        if (null !== $this->isMultiMaterial) {
            $res['is_multi_material'] = $this->isMultiMaterial;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecImageClassificationResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['batch_no'])) {
            $model->batchNo = $map['batch_no'];
        }
        if (isset($map['image_type'])) {
            $model->imageType = $map['image_type'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['enhance_image'])) {
            $model->enhanceImage = $map['enhance_image'];
        }
        if (isset($map['is_blur'])) {
            $model->isBlur = $map['is_blur'];
        }
        if (isset($map['is_copyfile'])) {
            $model->isCopyfile = $map['is_copyfile'];
        }
        if (isset($map['is_remakefile'])) {
            $model->isRemakefile = $map['is_remakefile'];
        }
        if (isset($map['is_uncomplet'])) {
            $model->isUncomplet = $map['is_uncomplet'];
        }
        if (isset($map['is_multi_material'])) {
            $model->isMultiMaterial = $map['is_multi_material'];
        }

        return $model;
    }
}
