<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class HitDetectItems extends Model {
    protected $_name = [
        'detectResourceLevel' => 'detect_resource_level',
        'detectTypeCode' => 'detect_type_code',
        'hitContent' => 'hit_content',
        'hitDetectResource' => 'hit_detect_resource',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->detectResourceLevel) {
            $res['detect_resource_level'] = $this->detectResourceLevel;
        }
        if (null !== $this->detectTypeCode) {
            $res['detect_type_code'] = $this->detectTypeCode;
        }
        if (null !== $this->hitContent) {
            $res['hit_content'] = $this->hitContent;
        }
        if (null !== $this->hitDetectResource) {
            $res['hit_detect_resource'] = $this->hitDetectResource;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return HitDetectItems
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['detect_resource_level'])){
            $model->detectResourceLevel = $map['detect_resource_level'];
        }
        if(isset($map['detect_type_code'])){
            $model->detectTypeCode = $map['detect_type_code'];
        }
        if(isset($map['hit_content'])){
            $model->hitContent = $map['hit_content'];
        }
        if(isset($map['hit_detect_resource'])){
            $model->hitDetectResource = $map['hit_detect_resource'];
        }
        return $model;
    }
    // 级别
    /**
     * @example 1
     * @var string
     */
    public $detectResourceLevel;

    // RULEORMODEL("RULEORMODEL", "规则或模型"), KEYWORDS("KEYWORDS", "关键字检测 "), REPEAT_MODEL("REPEAT_MODEL", "防重复模型"), REGEX("regex", "正则表达式"), URL("url", "URL检测"), SEXY_PIC("sexyPic", "黄图检测"), SAMPLE_PIC("samplePic", "样图检测"), OCR("ocr", "图文识别"), PICTURE_FACE("picture_face","图片人脸检测"), QRCODE("QRCode", "二维码检测"), MDP_MODEL("mdpModel", "mdp检测"), ANTI_SPAM_MODEL("anti_spam_model", "反垃圾模型");
    /**
     * @example RULEORMODEL
     * @var string
     */
    public $detectTypeCode;

    // 保存被命中的内容： 如正则表达式，则保存被正则表达式命中的内容
    /**
     * @example 百度，腾讯
     * @var string
     */
    public $hitContent;

    // 命中的检测项的资源： 如命中关键字，则存关键字，如命中正则表达式，则保存正则表达式
    /**
     * @example 百度
     * @var string
     */
    public $hitDetectResource;

}
