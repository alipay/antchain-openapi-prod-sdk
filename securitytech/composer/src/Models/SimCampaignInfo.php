<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class SimCampaignInfo extends Model
{
    // 营销活动id
    /**
     * @example
     *
     * @var string
     */
    public $campaignId;

    // 营销活动名
    /**
     * @example
     *
     * @var string
     */
    public $campaignName;

    // 营销图片
    /**
     * @example
     *
     * @var string
     */
    public $imageUrl;

    // 营销活动内容
    /**
     * @example {}
     *
     * @var string
     */
    public $content;
    protected $_name = [
        'campaignId'   => 'campaign_id',
        'campaignName' => 'campaign_name',
        'imageUrl'     => 'image_url',
        'content'      => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('campaignId', $this->campaignId, true);
        Model::validateRequired('campaignName', $this->campaignName, true);
        Model::validateRequired('imageUrl', $this->imageUrl, true);
        Model::validateRequired('content', $this->content, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->campaignId) {
            $res['campaign_id'] = $this->campaignId;
        }
        if (null !== $this->campaignName) {
            $res['campaign_name'] = $this->campaignName;
        }
        if (null !== $this->imageUrl) {
            $res['image_url'] = $this->imageUrl;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SimCampaignInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['campaign_id'])) {
            $model->campaignId = $map['campaign_id'];
        }
        if (isset($map['campaign_name'])) {
            $model->campaignName = $map['campaign_name'];
        }
        if (isset($map['image_url'])) {
            $model->imageUrl = $map['image_url'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
