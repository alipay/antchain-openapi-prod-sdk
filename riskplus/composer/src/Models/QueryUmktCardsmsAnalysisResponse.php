<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryUmktCardsmsAnalysisResponse extends Model
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

    // 卡片短信解析服务业务流水id，与渲染回执中的bizId保持一致
    /**
     * @var string
     */
    public $bizCardId;

    // 不支持卡片短信的手机号，以,分隔
    /**
     * @var string
     */
    public $notMediaMobiles;

    // 卡短解析短链返回参数
    /**
     * @var ShortUrlInfo[]
     */
    public $shortUrlInfos;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'bizCardId'       => 'biz_card_id',
        'notMediaMobiles' => 'not_media_mobiles',
        'shortUrlInfos'   => 'short_url_infos',
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
        if (null !== $this->bizCardId) {
            $res['biz_card_id'] = $this->bizCardId;
        }
        if (null !== $this->notMediaMobiles) {
            $res['not_media_mobiles'] = $this->notMediaMobiles;
        }
        if (null !== $this->shortUrlInfos) {
            $res['short_url_infos'] = [];
            if (null !== $this->shortUrlInfos && \is_array($this->shortUrlInfos)) {
                $n = 0;
                foreach ($this->shortUrlInfos as $item) {
                    $res['short_url_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUmktCardsmsAnalysisResponse
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
        if (isset($map['biz_card_id'])) {
            $model->bizCardId = $map['biz_card_id'];
        }
        if (isset($map['not_media_mobiles'])) {
            $model->notMediaMobiles = $map['not_media_mobiles'];
        }
        if (isset($map['short_url_infos'])) {
            if (!empty($map['short_url_infos'])) {
                $model->shortUrlInfos = [];
                $n                    = 0;
                foreach ($map['short_url_infos'] as $item) {
                    $model->shortUrlInfos[$n++] = null !== $item ? ShortUrlInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
